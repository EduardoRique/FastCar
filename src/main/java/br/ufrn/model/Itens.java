package br.ufrn.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "itens")
public class Itens extends OS implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(name = "idOsItens")
	private int idOsItens;
	
	@Column(name = "quantidade")
	private String quantidade;
	
	@Column(name = "valor")
	private String valor;
	
	@Column(name = "idPeca")
	private String idPeca;
	
	@Column(name = "status")
	private String status;
	
	public Long getIdOS() {
		return id;
	}
	
	public void setIdOS(Long id){
		this.id = id;
	}
	
	public Long getIDPessoa() {
		return id;
	}
	
	public void setIDPessoa(Long id){
		super.id = id;
	}
	
	public Long getIDServico() {
		return id;
	}
	
	public Long getIDpeca() {
		return id;
	}
	
	
}
