package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Agendamento extends Empresa {
	private int idAgendamento;
	private int idEmpresa;
	private int idveiculo;
	private int idServico;
	private String data = " ";
	private String hora = " ";
	
	public int getIdAgendamento() {
		return idAgendamento;
	}
	public void setIdAgendamento(int idAgendamento) {
		this.idAgendamento = idAgendamento;
	}
	public int getIdEmpresa() {
		return idEmpresa;
	}
	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	public int getIdveiculo() {
		return idveiculo;
	}
	public void setIdveiculo(int idveiculo) {
		this.idveiculo = idveiculo;
	}
	public int getIdServico() {
		return idServico;
	}
	public void setIdServico(int idServico) {
		this.idServico = idServico;
	}
	public String getData() {
		Date data = new Date();
	    SimpleDateFormat df;
	    df = new SimpleDateFormat("dd/MM/yyyy");	    
		return df.format(data);
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHora() {
		Date hora = new Date();
		SimpleDateFormat hf;	     
	    hf = new SimpleDateFormat("HH:mm:ss");	    	    
		return hf.format(hora);
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	
     
	
	
	
	
	
}
