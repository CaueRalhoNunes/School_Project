package dto;

public class BoletimDTO {
	private int id_boletim, bimestre, nota, fk_aluno, fk_disciplina;

	public int getId_boletim() {
		return id_boletim;
	}

	public void setId_boletim(int id_boletim) {
		this.id_boletim = id_boletim;
	}

	public int getBimestre() {
		return bimestre;
	}

	public void setBimestre(int bimestre) {
		this.bimestre = bimestre;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public int getFk_aluno() {
		return fk_aluno;
	}

	public void setFk_aluno(int fk_aluno) {
		this.fk_aluno = fk_aluno;
	}

	public int getFk_disciplina() {
		return fk_disciplina;
	}

	public void setFk_disciplina(int fk_disciplina) {
		this.fk_disciplina = fk_disciplina;
	}

}
