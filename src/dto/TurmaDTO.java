package dto;

public class TurmaDTO {
	private int id_turma, qtd_alunos, fk_curso;
	private String nome;
	public int getId_turma() {
		return id_turma;
	}
	public void setId_turma(int id_turma) {
		this.id_turma = id_turma;
	}
	public int getQtd_alunos() {
		return qtd_alunos;
	}
	public void setQtd_alunos(int qtd_alunos) {
		this.qtd_alunos = qtd_alunos;
	}
	public int getFk_curso() {
		return fk_curso;
	}
	public void setFk_curso(int fk_curso) {
		this.fk_curso = fk_curso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	} 

}
