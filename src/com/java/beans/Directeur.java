package com.java.beans;

public class Directeur extends Personne implements OperationDirecteur,OperationConseiller,OperationClient{

    public Directeur(String prenom, int identifiant) {
        super(prenom, identifiant);
    }

    @Override
    public void ouvrirCompte() {

    };

    @Override
    public void gestionClient() {

    };

    @Override
    public void fermetureCompte() {

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

    @Override
    public void ajouterAgence() {

    };

    @Override
    public void modifierAgence() {

    };

    @Override
    public void modifierConseiller() {

    };

    @Override
    public void recruterConseiller() {

    };

    @Override
    public void virerConseiller() {

    };

    @Override
    public void supprimerAgence() {

    };
}
