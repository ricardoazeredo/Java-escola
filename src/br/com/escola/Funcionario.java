package br.com.escola;

public abstract class Funcionario implements Pessoa {
	private String nome;
	private String titulacao;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	@Override
	public int obterIdade() {
		return this.idade;
		
	}
	
	@Override
	public void definirIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public String obterNome() {
		return this.nome;
	}
	
	@Override
	public void definirNome(String nome) {
		this.nome = nome;
	}
	
	
	public void mostrarFuncionario() {
		String funcionario = "O funcionário " + getNome() +" e " + getTitulacao();
		System.out.println(funcionario);
	}
}
