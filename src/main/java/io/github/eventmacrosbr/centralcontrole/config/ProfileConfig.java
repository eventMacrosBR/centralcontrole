package io.github.eventmacrosbr.centralcontrole.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.eventmacrosbr.centralcontrole.model.repository.Profiles;

@Configuration
public class ProfileConfig {

	@Bean
	public Profiles profiles() {
		return new Profiles();
	}
	
}
