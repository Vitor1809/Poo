package Entity;

public class Cao {
	private String nome;
	private String origem;
	private String ninhada;
	private String dtNascimento;
	private double preco;

	public Cao(String nome, String origem, String ninhada, String dtNascimento, double preco) {
		this.nome = nome;
		this.origem = origem;
		this.ninhada = ninhada;
		this.dtNascimento = dtNascimento;
		this.preco = preco;
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

}
