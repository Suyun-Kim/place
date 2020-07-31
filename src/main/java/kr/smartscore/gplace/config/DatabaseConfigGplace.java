package kr.smartscore.gplace.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "kr.smartscore.gplace.infrastructure.dao", sqlSessionFactoryRef = "gplaceSqlSessionFactory")
@EnableTransactionManagement
public class DatabaseConfigGplace {

    @Bean(name = "gplaceDataSource")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.gplace")
    public DataSource gplaceDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "gplaceSqlSessionFactory")
    public SqlSessionFactory gplaceSqlSessionFactory(@Qualifier("gplaceDataSource") DataSource gplaceDataSource) throws Exception {
        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(gplaceDataSource);
        sessionFactoryBean.setConfigLocation(new PathMatchingResourcePatternResolver().getResource("classpath:config/sql-mapper-config.xml"));
        sessionFactoryBean.setTypeAliasesPackage("kr.smartscore.gplace.infrastructure.dao.**.vo");
        sessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/**/*-mapper.xml"));
        return sessionFactoryBean.getObject();
    }

    @Bean(name = "gplaceSqlSession", destroyMethod = "clearCache")
    public SqlSessionTemplate gpalceSqlSession(@Qualifier("gplaceSqlSessionFactory") SqlSessionFactory gplaceSqlSessionFactory) {
        return new SqlSessionTemplate(gplaceSqlSessionFactory);
    }

}
