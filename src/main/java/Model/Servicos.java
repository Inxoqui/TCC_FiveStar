package Model;

public class Servicos {
	private id idser;
	private String nome;
	private double valor;
	
	//CONSTRUTOR PADRÃO
	public Servicos() {
		super();
		
	}
	
	//CONSTRUTOR DE OBJETO
	public Servicos(id idser, String nome, double valor) {
		super();
		this.idser = idser;
		this.nome = nome;
		this.valor = valor;
	}
	
	//GETTERS E SETTERS
	public id getIdser() {
		return idser;
	}


	public void setIdser(id idser) {
		this.idser = idser;
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
