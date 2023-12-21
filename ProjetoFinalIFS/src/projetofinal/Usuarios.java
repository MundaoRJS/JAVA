package projetofinal;

import java.util.Scanner;
public class Usuarios extends Pessoa {
	private String tipoUsuario;
	private String sigla;
	private int tempoEmprestimo;
	
	
	
	public Usuarios(int codId, String tipoUsuario, String nome) {
		this.setCodId(codId);
		this.setTipoUsuario(tipoUsuario);
		this.setNome(nome);
		this.getSigla();
		this.getTempoEmprestimo();
	}

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
		//this.sigla = sigla;
		if (getTipoUsuario()=="Aluno") {
			this.sigla = "alu";
		}else if (this.getTipoUsuario().equalsIgnoreCase("Aluno pós graduação")){
			this.sigla = "pos";
			
		}else if (this.getTipoUsuario().equalsIgnoreCase("Técnico Administrativo")) {
			this.sigla = "tec";
		}else {
			this.sigla = "pro";
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
			this.tempoEmprestimo=5;
			System.out.println("O"+this.getTipoUsuario()+ this.getNome()+" possui "+ this.getTempoEmprestimo()+
				"dias de emprestimo"	);
			break;
		case "pos":
			this.tempoEmprestimo=10;
			System.out.println("O"+this.getTipoUsuario()+ this.getNome()+" possui "+ this.getTempoEmprestimo()+
					"dias de emprestimo"	);
			break;
		case "tec":
			this.tempoEmprestimo=14;
			System.out.println("O"+this.getTipoUsuario()+ this.getNome()+" possui "+ this.getTempoEmprestimo()+
					"dias de emprestimo"	);
			break;
		case "pro":
			this.tempoEmprestimo=21;
			System.out.println("O"+this.getTipoUsuario()+ this.getNome()+" possui "+ this.getTempoEmprestimo()+
					"dias de emprestimo"	);
			break;		
		}
	}			
}
