package model;

public class Produtos {
	private int idPro;
	private String nome;
	private double valor;

	// CONTRUTOR
	public Produtos() {
		super();
	}

	// CONSTRUTOR DO OBJETO
	public Produtos(int idPro, String nome, double valor) {
		super();
		this.idPro = idPro;
		this.nome = nome;
		this.valor = valor;
	}

	// GETTERS E SETTERS
	public int getidPro() {
		return idPro;
	}

	public void setidPro(int idPro) {
		this.idPro = idPro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
