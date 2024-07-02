package com.example.javaSqlLearnig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JavaSqlLearnigApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSqlLearnigApplication.class, args);
	}
	@Bean
	public WebServerFactoryCustomizer<TomcatServletWebServerFactory> customizer() {
		return factory -> factory.setPort(8081);
	}

}
