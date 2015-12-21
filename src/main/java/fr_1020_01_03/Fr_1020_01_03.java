package fr_1020_01_03;

public class Fr_1020_01_03 {

	public static void main(String[] args) throws InterruptedException {
		Cuisinier c1 = new Cuisinier("casser les oeufs et battre");
		Cuisinier c2 = new Cuisinier("fondre le chocolat et mélanger au beure");
		
		//creation d'un objet Thread sur C1 et le démarrer
		//new Thread(c1).start();
		//new Thread(c2).start();
		
		
		Thread t1 = new Thread(c1);
		t1.start();
		Thread t2 =  new Thread(c2);
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("c'est bon !!");
	}

}
