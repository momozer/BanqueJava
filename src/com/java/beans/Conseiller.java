package com.java.beans;

public class Conseiller extends Personne implements OperationClient, OperationConseiller{
    public Conseiller(String prenom, int identifiant) {
        super(prenom, identifiant);
    }

    @Override
    public void afficherSolde() {

    };

    @Override
    public void verser() {

    };

    @Override
    public void retirer() {

    };

    @Override
    public void fermetureCompte() {

    };

    @Override
    public void gestionClient() {

    };

    @Override
    public void ouvrirCompte() {

    };

}
