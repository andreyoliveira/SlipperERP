package br.com.conceptmx.slipper.service;

import javax.enterprise.context.RequestScoped;

import br.com.conceptmx.slipper.domain.Usuario;

@RequestScoped
public class UsuarioService {
	
	public void validarCredenciais(Usuario usuarioExistente, Usuario usuario) {
		
	}
	
	public Usuario obterUsuario(Usuario usuario) {
		return usuario;
	}

}
