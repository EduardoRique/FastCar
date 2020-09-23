package br.ufrn.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "servico")
public class Servico implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "tempoMedio")
	private String tempoMedio;

	@Column(name = "valor")
	private Double valor;
	
	/*@ManyToOne
	@JoinColumn(name="module_id")
	private Module module;
	*/
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTempoMedio() {
		return tempoMedio;
	}

	public void setTempoMedio(String tempoMedio) {
		this.tempoMedio = tempoMedio;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double getValor() {
		return valor;
	}

}
