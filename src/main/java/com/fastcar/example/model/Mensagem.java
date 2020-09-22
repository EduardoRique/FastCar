package com.fastcar.example.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Mensagem extends Pessoa {
	
	private static final long serialVersionUID = 1L;
	private int idmensagem;
	private int idRemetente;
	private String mensagem;
	public int getIdmensagem() {
		return idmensagem;
	}
	public void setIdmensagem(int idmensagem) {
		this.idmensagem = idmensagem;
	}
	public int getIdRemetente() {
		return idRemetente;
	}
	public void setIdRemetente(int idRemetente) {
		this.idRemetente = idRemetente;
	}
	public String getData() {
		Date data = new Date();
	    SimpleDateFormat df;
	    df = new SimpleDateFormat("dd/MM/yyyy");	    
		return df.format(data);
	}
	public String gethora() {
		Date hora = new Date();
		SimpleDateFormat hf;	     
	    hf = new SimpleDateFormat("HH:mm:ss");	    	    
		return hf.format(hora);
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
		
	
}
