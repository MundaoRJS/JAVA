package uec;

public class Ring {

	public static void main(String[] args) {
		Lutador luta[] = new Lutador[6];
		
		 luta[0] = new Lutador( "Pretty Boy","França",31,1.75f,68.9f,11,3,1);
		 luta[1] = new Lutador("Putscript","Brasil",29,1.68f,57.8f,14,2,3);
		 luta[2] = new Lutador("Snapshadow","EUA",35,1.65f,80.9f,12,2,1);
		 luta[3] = new Lutador("DeadCode", "Austália",28,1.93f,81.6f,13,0,2);
		 luta[4] = new Lutador("UFOCobol","Brasil",37,1.70f,119.3f,5,4,3);
		 luta[5] = new Lutador("Nedaart","EUA",30,1.81f,105.7f,12,2,4);
		
		
		
		
		
		Luta UEC01 = new Luta();
		UEC01.marcarLuta(luta[1
		                      ], luta[1]);
		UEC01.lutar();
		
	}

}
