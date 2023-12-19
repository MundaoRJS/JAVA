package projetofinal;

import java.util.Scanner;
public class Usuarios extends Pessoa {
	private String tipoUsuario;
	private String sigla;
	private int tempoEmprestimo;
	
	
	
	public void cadastroUsuario() {
		Scanner cad = new Scanner(System.in);
		this.setCodId(cad.nextInt());
		this.setTipoUsuario(cad.next());
		this.setNome(cad.next());
		this.getSigla();
		
	}
	
	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		
		if (getTipoUsuario().equals("aluno")) {
			sigla = "alu";
		}else if (this.getTipoUsuario().equals("Aluno de pós-graduação")){
			sigla = "pos";
			
		}else if (this.getTipoUsuario().equals("Técnico Administrativo")) {
			sigla = "tec";
		}else {
			sigla = "pro";
		}
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public int getTempoEmprestimo() {
		return tempoEmprestimo;
	}

	public void setTempoEmprestimo(int tempoEmprestimo) {
		switch (getSigla()){
		case  "alu":
			this.setTempoEmprestimo(5);
			System.out.println("O"+this.getTipoUsuario()+ this.getNome()+" possui "+ this.getTempoEmprestimo()+
				"dias de emprestimo"	);
			break;
		case "pos":
			this.setTempoEmprestimo(10);
			System.out.println("O"+this.getTipoUsuario()+ this.getNome()+" possui "+ this.getTempoEmprestimo()+
					"dias de emprestimo"	);
			break;
		case "tec":
			this.setTempoEmprestimo(14);
			System.out.println("O"+this.getTipoUsuario()+ this.getNome()+" possui "+ this.getTempoEmprestimo()+
					"dias de emprestimo"	);
			break;
		case "pro":
			this.setTempoEmprestimo(21);
			System.out.println("O"+this.getTipoUsuario()+ this.getNome()+" possui "+ this.getTempoEmprestimo()+
					"dias de emprestimo"	);
			break;		
		}
	}

	@Override
	public void emprestimoLivro() {
		// TODO Auto-generated method stub
		
	}

		
}
