package com.example.ex4;

public class Revue extends Document {
	private String mois;
	private int annee;

	public Revue(int numEnr, String titre, String mois, int annee) {
		super(numEnr, titre);
		this.mois = mois;
		this.annee = annee;
	}

	public String getMois() {
		return mois;
	}

	public void setMois(String mois) {
		this.mois = mois;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	@Override
	public String toString() {
		return "Revue [mois=" + mois + ", annee=" + annee + ", numEnr=" + numEnr + ", titre=" + titre + "]";
	}
	

}
