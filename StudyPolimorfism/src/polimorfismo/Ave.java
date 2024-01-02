package polimorfismo;

public class Ave extends Animal {

	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Voando");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Comendo frutas");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("Som da ave");
	}
	
	public void fazerNinho() {
		System.out.println("Fazendo ninho");
	}

}
