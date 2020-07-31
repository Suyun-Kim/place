package kr.smartscore.gplace;

import com.navercorp.lucy.security.xss.servletfilter.XssEscapeServletFilter;
import kr.smartscore.gplace.config.AppStartLisner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.servlet.annotation.WebListener;

@SpringBootApplication
public class GplaceApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(GplaceApplication.class);
        application.addListeners( new AppStartLisner());
        application.run(args);
    }

}
