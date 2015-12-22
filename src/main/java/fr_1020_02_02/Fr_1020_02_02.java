package fr_1020_02_02;

public class Fr_1020_02_02 {

	static int compteur=0;
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread ( () -> compteur++);
		t1.start();
		
		t1.join();
		compteur++; // aura lieu avant l'operation de lecture, car on est dans le meme thread
		System.out.println("compteur: " + compteur);

	}

}
