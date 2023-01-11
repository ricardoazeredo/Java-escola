package br.com.escola;

public class Professor extends Funcionario {
	/*
	 * private String nome; private String titulacao;
	 * 
	 * public Professor() {
	 * 
	 * }
	 * 
	 * public String getNome() { return nome; }
	 * 
	 * public void setNome(String nome) { this.nome = nome; }
	 * 
	 * public String getTitulacao() { return titulacao; }
	 * 
	 * public void setTitulacao(String titulacao) { this.titulacao = titulacao; }
	 */
	
	public void mostrarProfessor() {
		String professor = "O professor "+ getNome()+" e "+getTitulacao()+ " com a idade "+ this.obterIdade()+" anos";
		System.out.println(professor);
	}
	
}
