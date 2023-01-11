package br.com.escola;

public class Coordenador extends Funcionario {
	
	@Override
	public void mostrarFuncionario() {
		String coordenador = "O Coordenador "+ getNome() +" e "+getTitulacao();
		System.out.println(coordenador);
	}
}
