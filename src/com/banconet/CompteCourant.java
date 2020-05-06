package com.banconet;

class CompteCourant {
    String numero;
    String intitule;
    double solde;
    double montantDecouvertAutorise;
    static int nbComptesCourant = 0;

    public CompteCourant(){
        nbComptesCourant +=1;
    }
}