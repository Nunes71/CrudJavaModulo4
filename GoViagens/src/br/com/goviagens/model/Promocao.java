package br.com.goviagens.model;

public class Promocao {
	
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String Nome;
	private int Valor;
	private int DestinosID;
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getValor() {
		return Valor;
	}
	public void setValor(int valor) {
		Valor = valor;
	}
	public int getDestinosID() {
		return DestinosID;
	}
	public void setDestinoID(int destinosID) {
		DestinosID = destinosID;
	}

}
