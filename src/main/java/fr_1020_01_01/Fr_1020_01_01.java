package fr_1020_01_01;

public class Fr_1020_01_01 {

	public static void main(String[] args) {
		
		// 1er partie
		MonThread mt = new MonThread();
		//lance le thread
		mt.start();
		
		//2eme partie
		// creation de l'objet Thread, avec passage en parametre du Runnable
		new Thread(new MonThread2()).start();
		
		//3éme partie
		// autre façon d'appeler le runable avec une classe anonyme
		new Thread(new Runnable() {
			
			public void run() {
				// TODO Auto-generated method stub
				
			}
		}).start();
		
		//4eme
		//lancement d'un thread avec une lambda expression
		new Thread( () -> System.out.println("Hello WORLD")).start();
		System.out.println("Fin du main");
	}

}
