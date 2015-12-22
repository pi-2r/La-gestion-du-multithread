package fr_1020_02_03;

//creation d'un singleton
//http://blog.paumard.org/2011/04/22/bilan-sur-le-pattern-singleton/
public class Connexion {
	private static Connexion instance;

	// synchronized == 1 seul thread peu rentré à la fois dans la méthode
	public static synchronized Connexion getInstance() {
		if (instance == null) {
			
			/* 
			 * Connexion.class == verrou tous les blocs synchronizés, 
			 * les méthodes synchronizés basé  sur ce verrou là, 
			 * sont interdit aux autres thread
			 *
			 */
			synchronized (Connexion.class) {
				instance = new Connexion();
			}

		}
		return instance;

	}

	private Connexion() {
		System.out.println("Constructeur de Connexion");
	}

	// methode d'instance
	public void open() {
		System.out.println("Open ...");
	}

	public void close() {
		System.out.println("Close ...");
	}
}
