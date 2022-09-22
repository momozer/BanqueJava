package com.java.beans;

public abstract class Personne {
    public String prenom;
    public int identifiant;

    public Personne(String prenom, int identifiant) {
        this.prenom = prenom;
        this.identifiant = identifiant;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }
}
