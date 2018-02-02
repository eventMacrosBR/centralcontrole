package io.github.eventmacrosbr.centralcontrole.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.eventmacrosbr.centralcontrole.service.OpenkoreService;

@Configuration
public class OpenkoreConfig {
	
	@Bean
	public OpenkoreService openkoreService() {
		return new OpenkoreService();
	}

}
