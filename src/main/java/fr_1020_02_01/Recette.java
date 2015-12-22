package fr_1020_02_01;

public class Recette {

	private int etat;

	public void etatOeufOk() {
		setEtat(1);
	}

	public void etatChocolatOk() {
		setEtat(2);
	}

	public int getEtat() {
		return etat;
	}

	public void setEtat(int etat) {
		this.etat = etat;
	}

	public int etat() {
		return etat;
	}

}
