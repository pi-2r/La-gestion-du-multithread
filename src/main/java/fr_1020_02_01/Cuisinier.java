package fr_1020_02_01;

public class Cuisinier implements Runnable {

	private Recette recette;
	private String tache;
	private int etat;

	public Cuisinier(String tache, Recette recette, int etat) {
		this.tache = tache;
		this.recette = recette;
		this.etat = etat;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(tache);
		}

		if (etat == 1) {

			if (recette.etat() == 2) {
				recette.etatOeufOk();
			}
		} else
			recette.etatChocolatOk();

	}

}
