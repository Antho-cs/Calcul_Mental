package domaine;

import java.util.Stack;
import java.util.Random;

public class Expression {

    // Opérateurs binaires
    private static final String[] binaires = {"+", "-", "*", "/"};
    // Opérateurs Unaires
    private static final String[] unaires = {"inv", "rac"};
    // TODO utilisation de Stack
    // Stack est une classe qui représente une pile d'objet ( Premier entré, premier sorti )
    private Stack<Double> stack;
    // Chaine qui contiendra l'ensemble des composant pour l'affichage utilisateur
    private String chaine;
    // Besoin de random pour les nombres aléatoires
    Random random = new Random();
    // Resultat de l'expression
    private Integer resultat;



//     TODO prise en compte du résultat

    // TODO A TESTER
    // Méthodes pour définir l'opérateur Unaire
    public void choixOpBinaire() {
        int i = random.nextInt(4);
        // On implémente la chaine suivant l'opérateur choisi au hasard
        chaine = "( " + chaine +  binaires[i]  + ")";
        System.out.println(chaine);
    }

    // TODO A TESTER
    // Méthodes pour définir l'opérateur Unaire
    public void choixOpUnaire() {
        int i = random.nextInt(2);
        // On implémente la chaine suivant l'opérateur choisi au hasard
        chaine = "( " + chaine +  unaires[i]  + ")";
        System.out.println(chaine);
        if (i == 0) {

        }
        else {

        }
//        stack.push();
    }

    // Méthodes de génération de calcul
    public void generator() {

    }



}