package fr_1020_03_01;

public class Cuisinier {

	private String tache;
	private boolean fini = false;

	public Cuisinier(String tache) {
		this.tache = tache;
	}

	synchronized void travailler(Cuisinier c2) {
		for (int i = 0; i < 10; i++) {
			System.out.println(tache);
		}
		fini = true;
		if (c2.asTuFini()) {
			System.out.println("c'est bon pour moi");
		}
	}

	private synchronized boolean asTuFini() {
		return fini;
	}

	//conclusion: les 2 threads s'attendent ...
}
