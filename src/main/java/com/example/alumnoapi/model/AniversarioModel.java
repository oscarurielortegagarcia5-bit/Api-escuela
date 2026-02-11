package com.example.alumnoapi.model;

public class AniversarioModel {
	private Integer año;
	private LugarModel lugar;
	
	public AniversarioModel(){
		
	}

	public AniversarioModel(Integer año, LugarModel lugar) {
		this.año = año;
		this.lugar = lugar;
	}

	public Integer getAño() {
		return año;
	}

	public void setAño(Integer año) {
		this.año = año;
	}

	public LugarModel getLugar() {
		return lugar;
	}

	public void setLugar(LugarModel lugar) {
		this.lugar = lugar;
	}

}

