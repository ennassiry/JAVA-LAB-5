package com.example.ex4;

public class Manuel extends Livre {

	private String niveau;

	public Manuel(int numEnr, String titre, String auteur, int nbpage, String niveau) {
		super(numEnr, titre, auteur, nbpage);
		this.niveau = niveau;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	@Override
	public String toString() {
		return "Manuel [niveau=" + niveau + ", auteur=" + auteur + ", nbpage=" + nbpage + ", numEnr=" + numEnr
				+ ", titre=" + titre + "]";
	}

	
	
}
