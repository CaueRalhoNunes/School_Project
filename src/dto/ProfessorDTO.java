package dto;

public class ProfessorDTO {
	private int id_professor, fk_area;
	private String nome, cpf, carteira_trabalho;
	public int getId_professor() {
		return id_professor;
	}
	public void setId_professor(int id_professor) {
		this.id_professor = id_professor;
	}
	public int getFk_area() {
		return fk_area;
	}
	public void setFk_area(int fk_area) {
		this.fk_area = fk_area;
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
	public String getCarteira_trabalho() {
		return carteira_trabalho;
	}
	public void setCarteira_trabalho(String carteira_trabalho) {
		this.carteira_trabalho = carteira_trabalho;
	}
}
