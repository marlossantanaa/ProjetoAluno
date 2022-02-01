package br.com.java.curso.app;

import javax.swing.JOptionPane;

import br.com.java.curso.Aluno;

public class appLaunch {

	public static void main(String[] args) {
		/* new aluno () é instancia (criaçãode objeto) */

		String nome = JOptionPane.showInputDialog("Nome do Aluno");
		String idade = JOptionPane.showInputDialog("Idade do aluno");
		String DataNascimento = JOptionPane.showInputDialog("Data de Nascimento");
		String RegistroGeral = JOptionPane.showInputDialog("RG ");
		String NumeroCpf = JOptionPane.showInputDialog("Cpf");
		String NomeMae = JOptionPane.showInputDialog("Nome da Mãe");
		String NomePai = JOptionPane.showInputDialog("Idade do aluno"); 
		String DataMatricula = JOptionPane.showInputDialog("Matricula");
		String SerieMatriculado = JOptionPane.showInputDialog("Serie do ALuno");
		String NomeEscola = JOptionPane.showInputDialog("Nome da Escola");
		String Nota1 = JOptionPane.showInputDialog("digite nota 1 do Aluno");
		String Nota2 = JOptionPane.showInputDialog("digite nota 2 do Aluno");
		String Nota3 = JOptionPane.showInputDialog("digite nota 3 do Aluno");
		String Nota4 = JOptionPane.showInputDialog("digite nota 4 do Aluno");
		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(DataNascimento);
		aluno1.setRegistroGeral(RegistroGeral);
		aluno1.setNumeroCpf(NumeroCpf);
		aluno1.setNomeMae(NomeMae);
		aluno1.setNomePai(NomePai);
		aluno1.setDataMatricula(DataMatricula);
		aluno1.setSerieMatriculado(SerieMatriculado);
		aluno1.setNomeEscola(NomeEscola);
		aluno1.setNota1(Double.parseDouble(Nota1));
		aluno1.setNota2(Double.parseDouble(Nota2));
		aluno1.setNota3(Double.parseDouble(Nota3));
		aluno1.setNota4(Double.parseDouble(Nota4));
		/*System.out.println("Nome do aluno:" + aluno1.getNome());
		System.out.println("Idade do aluno:" + aluno1.getIdade());
		System.out.println("Nascimento:" + aluno1.getDataNascimento());
		System.out.println(" Rg:" + aluno1.getRegistroGeral());
		System.out.println("Cpf" + aluno1.getNumeroCpf());
		System.out.println("filiação:" + aluno1.getNomePai() + " ," + aluno1.getNomeMae());
		System.out.println("Data da Matricula:" + aluno1.getDataMatricula());
		System.out.println("Serie do Aluno:" + aluno1.getSerieMatriculado());
		System.out.println("Nome da Escola" + aluno1.getNomeEscola());
		System.out.println("Média do aluno:" + aluno1.getMediaNota());
		// System.out.println("Renovação de Matricula:" + aluno1.getAlunoIdade());
		System.out.println("Obrigado volte logo");*/
		System.out.println(aluno1);
		System.out.println("Media do Aluno="+aluno1.getMediaNota());
		System.out.println("Resultado"+aluno1.getAlunoAprovado());

	}

}