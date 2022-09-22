package com.java.beans;

public class Client extends Personne implements OperationClient{

    public Client(String prenom, int identifiant) {
        super(prenom, identifiant);
    };

    @Override
    public void afficherSolde() {

    };

    @Override
    public void retirer() {


    };

    @Override
    public void verser() {

    };
}
