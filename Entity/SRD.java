package Entity;

public class SRD {
	private String nome;
	private String cruzamentos;
	private String porte;
	private double preco;

	public SRD(String nome, String cruzamentos, String porte, double preco) {
		this.cruzamentos = cruzamentos;
		this.nome = nome;
		this.porte = porte;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCruzamentos() {
		return cruzamentos;
	}

	public void setCruzamentos(String cruzamentos) {
		this.cruzamentos = cruzamentos;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
