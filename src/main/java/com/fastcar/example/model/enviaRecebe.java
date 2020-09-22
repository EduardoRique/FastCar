package com.fastcar.example.model;


public class enviaRecebe {
    //idDestinatario INT
    private int idDestinatario;
    //idMensagem INT
    private int idMensagem;

    public int getIddestinatario(){
            return idDestinatario;
    }
    public void setIdDestinatario(int idDestinatario){
            this.idDestinatario = idDestinatario;
    }
    
    public int getMsg() {
    	return this.idMensagem ;
    }
    public void setMsg(int idMsg) {
    	this.idMensagem = idMsg;
    }
}