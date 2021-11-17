package com.everis.bootcamp;


public class CircuitBreaker {
	
	private String estado; //Estado actual
	
	public CircuitBreaker(String estado) {
		this.estado = estado;
	}
	
	//Mi intención es que solo se lleguen a realizar hasta 10 iteraciones
	public String proximoEstado(Integer contador) {		
		String res = "";
		
		if(estado.equals("half-open") && contador <= 10) {
			System.out.println(estado);
			estado = "open";
			res = "open";
		} else if (estado.equals("half-open") && contador > 10) {
			System.out.println(estado);
			estado = "closed";
			res = "closed";
		}
		
		if(estado.equals("closed") && contador <= 10) {
			System.out.println(estado);
			estado = "half-open";
			res = "half-open";
		}
		
		if(estado.equals("open") && contador <= 10) {
			System.out.println(estado);
			estado = "half-open";
			res = "half-open";
		}
			
		return res; 
	}
	

}
