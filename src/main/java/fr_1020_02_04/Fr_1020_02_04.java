package fr_1020_02_04;

//http://blog.paumard.org/cours/java-api/chap05-concurrent-atomicite.html
public class Fr_1020_02_04 {

	public static int age = 0;
	public static int datenaissance = 0;
	public static long compteur = 0;

	public static void main(String[] args) {

		new Thread(() -> {

			for (int i = 0; i < 100000; i++) {
				age = 15;
				datenaissance = 2000;
				compteur = 1000000000;
			}
		}).start();

		new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				System.out.println("age " + age + " date " + datenaissance
						+ " compteur " + compteur);
				age = 0;
				datenaissance = 0;
				compteur = 0;
			}

		}).start();

	}

}
