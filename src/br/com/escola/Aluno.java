package br.com.escola;

public class Aluno implements Pessoa {
	private String nome;
	private int matricula;
	private int idade;
	
	public Aluno() {
		
	}
	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
		mostrarAluno();
	}
	
	//getter and setter
	//Mesmo que um setter
	
	@Override
	public void definirNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String obterNome() {
		return this.nome;
	}
	
	
	/*
	 * public String getNome() { return this.nome; }
	 * 
	 * public void setNome(String nome) { this.nome = nome; }
	 */
	
	public int getMatricula() {
		return this.matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	//metodos
	public void mostrarAluno() {
		String alunosDescricao = "O aluno " + this.nome +" com a matricula "+ this.matricula +
				" tem idade "+ this.idade + " anos";
		System.out.println(alunosDescricao);		
		
	}
	
	
	@Override
	public void definirIdade(int idade) {
		this.idade = idade;
	}
	@Override
	public int obterIdade() {
		return this.idade;
	}
	
}
