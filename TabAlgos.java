/**
 * ceci est l'exercice 2 du devoir 1 module C306.
 * @author philemon, mars 2021
 * */
package com.devoir1C306;

import java.util.Arrays;

public final class TabAlgos {
/**
 * Constructeur protected avec exception
 * pour empecher l'instanciation de la classe utilitaire TabAlgos.
 * */
protected TabAlgos() {
try {
System.out.println("ne peut etre instancie");
} catch (Exception e) {

}
}

/**
 * @param tab en parametre
 * @return valeur la plus grande d'un tableau.
 * */
public static int plusGrand(final int[] tab) {
    int max = tab[0];
    for (int i = 0; i < tab.length; i++) {
if (tab[i] > max) {
max = tab[i];
}
    }
    return max;
}

/**
* @param tab en parametre
* @return moyenne des valeurs du tableau.
* @throw IllegalArgumentException si tab est null ou vide.
**/
public static double moyenne(final int[] tab) {
double mean = 0;
int sum = 0;
for (int i = 0; i < tab.length; i++) {
sum += tab[i];
}
mean = sum / tab.length;

return mean;
}

/**
* @param tab1 comme 1er parametre
* @param tab2 comme 2nd parametre
* Compare le contenu de 2 tableaux en tenant compte de l'ordre.
* @return true si les 2 tableaux contiennent les mêmes éléments
*
avec les mêmes nombres d'occurences
*
(avec les elements dans le meme ordre).
**/
public static boolean egaux(final int[] tab1, final int[] tab2) {
boolean equalOrdered = true;
for (int i = 0; i < tab1.length; i++) {
if (equalOrdered) {
if (tab1[i] != tab2[i]) {
equalOrdered = false;
}
}
}
return equalOrdered;
}

/**
* @param tab1 comme 1er parametre
* @param tab2 comme 2nd parametre
* Compare le contenu de 2 tableaux sans tenir compte de l'ordre.
* @return true si les 2 tableaux contiennent les mêmes éléments
*
avec les mêmes nombres d'occurrence
*
(pas forcément dans le meme ordre).
**/
public static boolean similaires(final int[] tab1, final int[] tab2) {
Arrays.sort(tab1);
Arrays.sort(tab2);
return egaux(tab1, tab2);
}
}
