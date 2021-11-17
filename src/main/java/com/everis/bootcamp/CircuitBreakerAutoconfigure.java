package com.everis.bootcamp;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(CircuitBreaker.class)
@EnableConfigurationProperties(CircuitBreakerProperties.class)
public class CircuitBreakerAutoconfigure {
	
	private final CircuitBreakerProperties properties;
	
	public CircuitBreakerAutoconfigure(CircuitBreakerProperties properties) {
		this.properties = properties;
	}
	
	@Bean
	public CircuitBreaker cb() {
		return new CircuitBreaker(properties.getEstado());
	}

}
