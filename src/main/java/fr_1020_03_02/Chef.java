package fr_1020_03_02;

public class Chef implements Runnable {

	private Recette recette;
	
	public Chef(Recette recette) {
		this.recette = recette;
	}
	@Override
	public void run() {
	recette.faireFondreChoco();
		
	}

}
