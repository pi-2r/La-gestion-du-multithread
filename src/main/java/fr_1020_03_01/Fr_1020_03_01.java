package fr_1020_03_01;

public class Fr_1020_03_01 {

	public static void main(String[] args) throws InterruptedException {
		Cuisinier c1 = new Cuisinier("casser les oeufs");
		Cuisinier c2 = new Cuisinier("Faire fondre le chocolat");
		
		Thread t1 = new Thread( () -> c1.travailler(c2));
		Thread t2 = new Thread( () -> c2.travailler(c1));
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Fin du travail en cuisine");

	}
}
