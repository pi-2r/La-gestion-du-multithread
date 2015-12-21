package fr_1020_01_03;

public class Cuisinier implements Runnable {

	String tache;

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(tache);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
		}

	}

	public Cuisinier(String tache) {
		this.tache = tache;
	}

}
