package fr_1020_01_02;

public class Fr_1020_01_02 {

	public static void main(String[] args) {

		Thread t = new Thread(() -> {
		
				for (int i = 0; i < 10; i++) {
					System.out.println("Le thread tourne....");
					if  (Thread.interrupted()) {
						System.out.println("Thread interronpu");
						break;
					}
				}
		});

		// référence du thread depuis l'extérieur
		t.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
		t.interrupt();
	}

}
