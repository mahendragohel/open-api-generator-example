package com.example.demo;


import com.example.demo.api.PetApiDelegate;
import com.example.demo.delegate.PetApiDelegateImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@EnableGlobalMethodSecurity(
		prePostEnabled = true,
		securedEnabled = true,
		jsr250Enabled = true)
@SpringBootApplication
public class OpenApiExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenApiExampleApplication.class, args);
	}

	@Bean
	public PetApiDelegate petApiDelegate(){
		return new PetApiDelegateImpl();
	}

}
