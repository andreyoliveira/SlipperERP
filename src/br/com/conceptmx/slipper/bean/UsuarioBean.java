package br.com.conceptmx.slipper.bean;

import javax.faces.bean.ManagedBean;

import br.com.conceptmx.slipper.dao.DAO;
import br.com.conceptmx.slipper.domain.Usuario;

/**
 * @author andreyoliveira
 * @since 26/01/2014
 */
@ManagedBean
public class UsuarioBean {
	
	private Usuario usuario = new Usuario();

	public Usuario getUsuario() {
		return usuario;
	}
	
	public String gravarUsuario(){
		new DAO<Usuario>(Usuario.class).adiciona(this.usuario);
		return "index?faces-redirect=true";
	}

}
