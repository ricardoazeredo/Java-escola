package br.com.escola;

public class TestarProfessor {

	public static void main(String[] args) {
		
		Professor professor = new Professor();
		professor.setNome("Chaves Rodrigues");
		professor.setTitulacao("Mestre em Ciência da computação");
		professor.definirIdade(41);
		professor.mostrarProfessor();
		professor.mostrarFuncionario();
		
		String prof = professor.getTitulacao();
		System.out.println(prof);
	}

}
