package com.everis.bootcamp;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("circuitbreaker.proximoestado")
public class CircuitBreakerProperties {

	private String estado = "closed";
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}

}
