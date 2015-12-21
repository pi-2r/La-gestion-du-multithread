package fr_1020_01_04;

public class Cuisinier implements Runnable{

	private String tache;
	
	public Cuisinier(String tache) {
		this.tache = tache;
	}

	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println(tache);
			//on récupere le thread courrant
			System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getId());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
		}
	}

}
