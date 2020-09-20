package model;

public class Empresa {
	private int idEmpresa;
	private String razaoSocial;
	private String endereco;
	private String montadora;
	
	public int getIdEmpresa() {
		return idEmpresa;
	}
	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getMontadora() {
		return montadora;
	}
	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}

}
