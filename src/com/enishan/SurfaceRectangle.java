package com.enishan;

import java.util.*;

public class SurfaceRectangle
{
    public static void main(String[] args)
    {
	System.out.println ("Ce programme va nous aider a calculer la surface d'un rectangle !");   //Affichage du but du programme
    double longueur, largeur, surface; //Declaration de deux variables
    Scanner lectureClavier = new Scanner (System.in); //Declaration de la variable representant la saisie
    System.out.println ("Veuillez saisir la longueur de votre rectangle :"); //Affichage pour la premiere saisie
    longueur = lectureClavier.nextDouble(); //Assignation de la valeur de la premiere saisie dans la variable longueur
    System.out.println ("Merci, veuillez maintenant saisir la largeur de votre rectangle :");
    largeur = lectureClavier.nextDouble(); //Assignation de la valeur de la seconde saisie dans la variable largeur
    surface = longueur*largeur ; //Calcul de la surface
    System.out.println ("Le rectangle pour lequel vous avez saisi une longueur de " + longueur + " et une largeur de " + largeur + " affiche une surface d'une valeur de " + surface + "! Merci et bonne journée ! ");
    }


}
