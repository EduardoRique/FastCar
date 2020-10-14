package br.ufrn.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "peca")
public class Peca extends Itens implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(name = "idOsItens")
	private int idOsItens;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "valor")
	private double valor;
}
