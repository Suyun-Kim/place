package kr.smartscore.gplace.config;

import kr.smartscore.gplace.domain.common.entity.CommonProperties;
import kr.smartscore.gplace.domain.common.code.enumMapper.EnumMapperValue;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.builders.*;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
    @Value("${swagger.name}")
    private String title;
    @Value("${swagger.base-url}")
    private String baseUrl;
    @Value("${swagger.version}")
    private String version;

    @Bean
    public Docket commonApi() {

        return new Docket(DocumentationType.SWAGGER_2)
                .useDefaultResponseMessages(false)
                .globalResponseMessage(RequestMethod.POST, newArrayList())
                .globalResponseMessage(RequestMethod.GET,  newArrayList())
                .globalResponseMessage(RequestMethod.DELETE,  newArrayList())
                .globalResponseMessage(RequestMethod.PUT,  newArrayList())
                .select()
                .paths(PathSelectors.any())
                .apis(RequestHandlerSelectors.basePackage(baseUrl))
                .build()
                .securitySchemes(newArrayList(apiKey()))
                .securityContexts(Arrays.asList(securityContext()))
                .apiInfo(apiInfo())
                .ignoredParameterTypes(CommonProperties.class, EnumMapperValue.class);
    }

    private ApiInfo apiInfo() {

        return new ApiInfoBuilder()
                .title(title)
                .description("")
                .termsOfServiceUrl("")
                .version(version)
                .build();
    }

    private ApiKey apiKey() {
        return new ApiKey("Authorization4SS", "Authorization4SS", "header");
    }

    private SecurityContext securityContext() {

        return SecurityContext.builder().securityReferences(defaultAuth())
                .forPaths(PathSelectors.any()).build();
    }

    private List<SecurityReference> defaultAuth() {

        AuthorizationScope authorizationScope = new AuthorizationScope(
                "global", "accessEverything");
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        authorizationScopes[0] = authorizationScope;
        return Arrays.asList(new SecurityReference("Authorization4SS",
                authorizationScopes));
    }

    @Bean
    UiConfiguration uiConfig() {

        return UiConfigurationBuilder.builder()
                .deepLinking(true)
                .displayOperationId(false)
                .defaultModelsExpandDepth(1)
                .defaultModelExpandDepth(1)
                .defaultModelRendering(ModelRendering.EXAMPLE)
                .displayRequestDuration(false)
                .docExpansion(DocExpansion.NONE)
                .filter(false)
                .maxDisplayedTags(null)
                .operationsSorter(OperationsSorter.ALPHA)
                .showExtensions(false)
                .tagsSorter(TagsSorter.ALPHA)
                .validatorUrl(StringUtils.EMPTY)
                .build();
    }
}
