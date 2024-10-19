package Model;

public class Servicos {
	private int idser;
	private String nome;
	private double valor;
	
	//CONSTRUTOR PADRÃO
	public Servicos() {
		super();
		
	}

	//CONSTRUTOR DO OBJETO
	public Servicos(int idser, String nome, double valor) {
		super();
		this.idser = idser;
		this.nome = nome;
		this.valor = valor;
	}

	public int getIdser() {
		return idser;
	}

	public void setIdser(int idser) {
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