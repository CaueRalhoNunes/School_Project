package dto;

public class CursoDTO {
	private int id_curso, qtd_semestre, fk_area;
	private String nome_curso;
	public int getId_curso() {
		return id_curso;
	}
	public void setId_curso(int id_curso) {
		this.id_curso = id_curso;
	}
	public int getQtd_semestre() {
		return qtd_semestre;
	}
	public void setQtd_semestre(int qtd_semestre) {
		this.qtd_semestre = qtd_semestre;
	}
	public int getFk_area() {
		return fk_area;
	}
	public void setFk_area(int fk_area) {
		this.fk_area = fk_area;
	}
	public String getNome_curso() {
		return nome_curso;
	}
	public void setNome_curso(String nome_curso) {
		this.nome_curso = nome_curso;
	}

}
