package projeto_java;

public class Beneficiarios {
	private String nome; 
	private int idade, pessoasFamilia, bolsaFamilia, cadUnico, uf;
    private double renda, rendaPerCapita;
	
    
    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getPessoasFamilia() {
		return pessoasFamilia;
	}
	public void setPessoasFamilia(int pessoasFamilia) {
		this.pessoasFamilia = pessoasFamilia;
	}
	public int getBolsaFamilia() {
		return bolsaFamilia;
	}
	public void setBolsaFamilia(int bolsaFamilia) {
		this.bolsaFamilia = bolsaFamilia;
	}
	public int getCadUnico() {
		return cadUnico;
	}
	public void setCadUnico(int cadUnico) {
		this.cadUnico = cadUnico;
	}
	public int getUf() {
		return uf;
	}
	public void setUf(int uf) {
		this.uf = uf;
	}
	public double getRenda() {
		return renda;
	}
	public void setRenda(double renda) {
		this.renda = renda;
	}
	public double getRendaPerCapita() {
		rendaPerCapita = renda / pessoasFamilia;
		return rendaPerCapita;
	}
	public void setRendaPerCapita(double rendaPerCapita) {
		this.rendaPerCapita = rendaPerCapita;
	}

}
