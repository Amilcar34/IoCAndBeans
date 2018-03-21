package com.amilcar.modelo;

public class Motor {

	private double caballosF;
	private String tipo;

	public Motor() {
		// TODO Auto-generated constructor stub
	}
	public Motor(double caballosF, String tipo) {
		super();
		this.caballosF = caballosF;
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Motor [caballosF=" + caballosF + ", tipo=" + tipo + "]";
	}
	public double getCaballosF() {
		return caballosF;
	}
	public void setCaballosF(double caballosF) {
		this.caballosF = caballosF;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
