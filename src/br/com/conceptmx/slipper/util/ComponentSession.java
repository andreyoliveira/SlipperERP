package br.com.conceptmx.slipper.util;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.com.conceptmx.slipper.domain.Usuario;


@Named
@SessionScoped
public class ComponentSession implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 8975123428609846923L;

	private Usuario usuario;


	public ComponentSession() {
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Boolean isLogado() {
		return this.usuario != null;
	}

	public void informarUsuario(Usuario usuarioExistente) {
		this.usuario = usuarioExistente;
	}

	public void sair() {
		this.usuario = null;
	}
}
