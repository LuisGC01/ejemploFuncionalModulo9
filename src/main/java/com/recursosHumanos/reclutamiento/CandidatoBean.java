package com.recursosHumanos.reclutamiento;

import java.io.Serializable;

import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@SessionScoped
public class CandidatoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8463063443349736411L;
	private String nombre;
	private String telefono;
	private String correo;
	private String mensaheespuesta;

	@Inject
	private MessageBean messageBean;

	public String getMensaheespuesta() {
		return mensaheespuesta;
	}

	public void setMensaheespuesta(String mensaheespuesta) {
		this.mensaheespuesta = mensaheespuesta;
	}

	public String registrar() {
		System.out.println("guardando nombre " + nombre);
		System.out.println("guardando telefono " + telefono);
		System.out.println("guardando correo " + correo);
		messageBean.setMensaje("felicidades " + nombre + ", has quedado registrado como condidato");
		return "index";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

}
