package online.ennassiry.tp;

public class Livre extends Document{
protected String auteur;
protected int nbpage;

public Livre(int numEnr, String titre, String auteur, int nbpage) {
	super(numEnr, titre);
	this.auteur = auteur;
	this.nbpage = nbpage;
}


}
