package fr_1020_03_02;

public class Recette {

	private boolean oeufKO = false;
	private boolean chocoFondu = false;

	synchronized void faireFondreChoco() {
		System.out.println("fait fondre le chocolat");
		if (!oeufKO) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
		}

		System.out.println("on mélange !!");

	}

	synchronized void casserLesOeufs() {
		System.out.println("casser les oeufs");
		oeufKO = true;
		notifyAll();
	}
}
