package br.com.conceptmx.slipper.bean;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

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
	
	public String gravarUsuario() throws NoSuchAlgorithmException, UnsupportedEncodingException{
		
		criptografaSenha();
		
		new DAO<Usuario>(Usuario.class).adiciona(this.usuario);
		return "index?faces-redirect=true";
	}
	
	private void criptografaSenha() throws NoSuchAlgorithmException, UnsupportedEncodingException {
		MessageDigest algorythm = MessageDigest.getInstance("MD5");
		byte[] messageDigest = algorythm.digest(this.usuario.getPassword().getBytes("UTF-8"));
		
		StringBuilder hexString = new StringBuilder();
		for (byte b : messageDigest) {
		  hexString.append(String.format("%02X", 0xFF & b));
		}
		String senha = hexString.toString();
		
		this.usuario.setPassword(senha);
	}

}
