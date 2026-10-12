package com.example.ex4;

public class Roman extends Livre{

	private double prix;

	
	public Roman(int numEnr, String titre, String auteur, int nbpage, double prix) {
		super(numEnr, titre, auteur, nbpage);
		this.prix = prix;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Roman [prix=" + prix + ", auteur=" + auteur + ", nbpage=" + nbpage + ", numEnr=" + numEnr + ", titre="
				+ titre + "]";
	}
	
	
}
