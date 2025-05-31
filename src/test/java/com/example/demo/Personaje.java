package com.example.demo;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "Personaje")
public class Personaje 
{
	@Id 
	
	private String id;
	private String Nombre;
	private String juegos;
	private int añoSalida;
	private boolean completado;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getJuegos() {
		return juegos;
	}
	public void setJuegos(String juegos) {
		this.juegos = juegos;
	}
	public int getAñoSalida() {
		return añoSalida;
	}
	public void setAñoSalida(int añoSalida) {
		this.añoSalida = añoSalida;
	}
	public boolean isCompletado() {
		return completado;
	}
	public void setCompletado(boolean completado) {
		this.completado = completado;
	}
	public Personaje(String id, String nombre, String juegos, int añoSalida, boolean completado) {
		super();
		this.id = id;
		Nombre = nombre;
		this.juegos = juegos;
		this.añoSalida = añoSalida;
		this.completado = completado;
	}
	

}
