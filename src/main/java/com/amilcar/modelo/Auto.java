package com.amilcar.modelo;

import com.amilcar.modelo.Motor;;
public class Auto {
	
	private String color;
	private String modelo;
	private String marca;
	private Motor motor;	
	
	
	
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	@Override
	public String toString() {
		return "Auto [color=" + color + ", modelo=" + modelo + ", marca=" + marca + ", motor=" + motor + "]";
	}
	
	public Auto() {
		// TODO Auto-generated constructor stub
	}
	public Auto(String color, String modelo, String marca, Motor motor) {
		super();
		this.color = color;
		this.modelo = modelo;
		this.marca = marca;
		this.motor = motor;
	}
	
	
	
	
}
