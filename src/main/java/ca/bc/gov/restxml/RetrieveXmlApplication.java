package ca.bc.gov.restxml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class RetrieveXmlApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(RetrieveXmlApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(RetrieveXmlApplication.class);
	}

}
