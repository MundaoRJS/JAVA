package estudodeheranca;

public  class Aluno extends Pessoa{
	private int matr;
	private String curso;
	
	
	public void cancelarMatr() {
		System.out.println("Matrícula será cancelada ");
	}
	
	public  void pagarMensalidade() {
		System.out.println("pagando mensalidae d0 Aluno "   + this.getNome());
	}

// Geters and Seters
	public int getMatr() {
		return matr;
	}


	public void setMatr(int matr) {
		this.matr = matr;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
