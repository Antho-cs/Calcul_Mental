package domaine;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Classe de Création/Génération des Expressions Polonaises
 * @author Antho
 */
public class Expression {
//    TODO Mémo !!!
//    http://icps.u-strasbg.fr/~violard/POO/2011-2012/TP3.html

    // TODO utilisation de Stack
    // Stack est une classe qui représente une pile d'objet ( Premier entré, premier sorti )
    private List<String> stack = new ArrayList<String>();
    // Chaine qui contiendra l'ensemble des composant pour l'affichage utilisateur
    private String chaine;
    // Besoin de random pour les nombres aléatoires
    Random random = new Random();
    // Resultat de l'expression
    private Integer resultat;


    /**
     * Fonction retournant un nombre aléatoire entre les 2 nombres en parametres.
     *@param min nombre minimum à comparer
     *@param max nombre maximum à comparer, max est exclu.
     *@return un entier compris entre mini et max
     */
    private int random(int min, int max) {
        Random r = new Random();
        return r.nextInt(max - min) + min;
    }

    /**
     * Méthodes retournant un opérateurs binaires aléatoire compris entre ( + , - , * , / ).
     *@return String
     */
    private String choixOpBinaire() {
        // Opérateurs binaires
        final String[] binaires = {"+", "-", "*", "/"};
        Integer b = random(0,4);
        return binaires[b];
    }

    /**
     * Méthodes retournant un opérateurs Unaires aléatoire ( rac ou inv ).
     *@return String
     */
//    TODO Changer l'accessibilité en privé
    public String choixOpUnaire() {
        // Opérateurs Unaires
        final String[] unaires = {"inv", "rac"};
        Integer u = random(0,2);
        return unaires[u];
    }

    // Méthodes de génération de calcul
    public List<String> generator() {
        // Ajoute 2 nombre aléatoire dans la pile tout en y ajoutant le nombre pour le resultat
        Integer j = random(0,101);
        Integer k = random(0,101);
        Integer z = random(0,101);

        String jS = j.toString();
        String kS = k.toString();
        String zS = z.toString();

        stack.add(zS);
        stack.add(jS);
        stack.add(kS);

        String cz = choixOpBinaire();
        stack.add(cz);

        switch (random(0,2)){
            case 0:
                String ch = choixOpUnaire();
                stack.add(ch);
                break;
            case 1:
                String cd = choixOpBinaire();
                stack.add(cd);
                break;
        }

//
//        stack.push(Integer.toString(j));
////        stack.push(k.toString());
//        System.out.println("ZOUZOU");
//        System.out.println(stack.toString() + "svqqbfdb");
//
//        stack.push(choixOpBinaire());
//        stack.push(choixOpBinaire());

        System.out.println(stack);
            /* Si c'est un nombre on empile
                - si c'est un binaire on dépile 2 valeurs on fait l'opération et on empile le resultat
                - si c'est unnaire on dépile de 1 on fait l'opération et empile le résultat
             */
//            resultat =
//            System.out.println(stack);
//            stack.push(choixOpBinaire());
        // Ajoute un nombre

        // Méthodes de la classe Stack
//        stack.pop(); // Supprime le dernier objet de la pile et le renvoi
//        stack.push("ds"); // Ajoute le dernier élément au dessus de la pile
//        stack.empty(); // Retourne un booléen si c'est vide ou non
//        stack.peek(); // Regarde le dernier éléments de la pile.
        return stack;
    }



}