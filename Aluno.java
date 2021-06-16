public class Aluno extends Pessoa {
	private int matricula;
	private String curso;
	
	public void cancelarMatri() {
		System.out.println("Matrícula será cancelada");
		
	}
	
	public Aluno(String nome, int idade, String sexo, int matricula, String curso) {
		super(nome, idade, sexo);
		this.matricula = matricula;
		this.curso = curso;
	}



	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	

}
