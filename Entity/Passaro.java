package Entity;

public class Passaro {
	private String nome;
	private String origem;
	private String ninhada;
	private String dtNascimento;
	private double preco;
	private String grupo;

	public Passaro(String nome, String origem, String ninhada, String dtNascimento, double preco, String grupo) {
		this.nome = nome;
		this.origem = origem;
		this.ninhada = ninhada;
		this.dtNascimento = dtNascimento;
		this.preco = preco;
		this.grupo= grupo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getNinhada() {
		return ninhada;
	}

	public void setNinhada(String ninhada) {
		this.ninhada = ninhada;
	}

	public String getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo= grupo;
	}
	
}
