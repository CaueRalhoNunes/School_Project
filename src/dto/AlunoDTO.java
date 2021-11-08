package dto;

public class AlunoDTO {
	private int id_aluno, fk_turma;
	private String nome, cpf, dt_nascimento;
	public int getId_aluno() {
		return id_aluno;
	}
	public void setId_aluno(int id_aluno) {
		this.id_aluno = id_aluno;
	}
	public int getFk_turma() {
		return fk_turma;
	}
	public void setFk_turma(int fk_turma) {
		this.fk_turma = fk_turma;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDt_nascimento() {
		return dt_nascimento;
	}
	public void setDt_nascimento(String dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}


}
