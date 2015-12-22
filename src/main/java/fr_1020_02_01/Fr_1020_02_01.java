package fr_1020_02_01;

public class Fr_1020_02_01 {

	public static void main(String args[]) throws InterruptedException {
		Recette recette = new Recette();
		
		Cuisinier c1 = new Cuisinier("Faire fondre le chocolat", recette, 1);
		Cuisinier c2 = new Cuisinier("Casser les oeufs", recette, 2);
		
		Thread t1 =  new Thread(c1);
		Thread t2 = new Thread(c2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Je mélange");
	}
}
