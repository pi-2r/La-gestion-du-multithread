package fr_1020_02_03;

public class Fr_1020_02_03 {

	public static void main(String[] args) {

		new Thread(() -> Connexion.getInstance().open()).start();
		new Thread(() -> Connexion.getInstance().close()).start();
	}

}
