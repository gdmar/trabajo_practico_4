package ar.edu.unju.fi.model;

import org.springframework.stereotype.Component;

@Component
public class Carrera {
	private String codigo;
	private String nombre;
	private int cantidadAño;
	private String estado;
	
	
	public Carrera() {
		super();
	}


	public Carrera(String codigo, String nombre, int cantidadAño, String estado) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.cantidadAño = cantidadAño;
		this.estado = estado;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCantidadAño() {
		return cantidadAño;
	}


	public void setCantidadAño(int cantidadAño) {
		this.cantidadAño = cantidadAño;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}
	

}
