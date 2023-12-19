package projetofinal;

import java.util.Scanner;
import java.util.ArrayList;

public class Biblioteca extends Usuarios{

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		String cad = ent.next();
		//String[] cads = cad.split("/");
		//ystem.out.println(cads[1]);
		
		ArrayList<String> nomes= new ArrayList<String>();		
		nomes.add("Goku");
		nomes.add("Claudio");
		nomes.add("Gok");
		nomes.add("Clau");
		nomes.add("Go");
		
		
		for (int aito = 0 ; aito < nomes.size(); aito ++) {
			System.out.println(nomes.get(aito));
			
		}
		System.out.println("");
		//removendo elementos 
		nomes.remove(3);
		for(String n : nomes) {
			System.out.println(n);
		}
		
		
		
		ArrayList<Usuarios> cadastro= new ArrayList<Usuarios>();
		Usuarios u1 = new Usuarios();
		u1.cadastroUsuario();
		
	}

}
