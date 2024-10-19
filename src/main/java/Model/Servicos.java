package model;

public class Servicos {
	private int idSer;
	private String nome;
	private double valor;
	
	//CONSTRUTOR PADRÃO
	public Servicos() {
		super();
		
	}

	//CONSTRUTOR DO OBJETO
	public Servicos(int idSer, String nome, double valor) {
		super();
		this.idSer = idSer;
		this.nome = nome;
		this.valor = valor;
	}

	public int getidSer() {
		return idSer;
	}

	public void setidSer(int idSer) {
		this.idSer = idSer;
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