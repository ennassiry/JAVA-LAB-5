package com.example.ex4;

public class Dictionnaire extends Document {
private String langue;

public Dictionnaire(int numEnr, String titre, String langue) {
	super(numEnr, titre);
	this.langue = langue;
}

public String getLangue() {
	return langue;
}

public void setLangue(String langue) {
	this.langue = langue;
}

@Override
public String toString() {
	return "Dictionnaire [langue=" + langue + ", numEnr=" + numEnr + ", titre=" + titre + "]";
}



}
