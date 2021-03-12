/**
 * ceci est l'exercice 2 du devoir 1 module C306.
 * @author philemon, mars 2021
 * */
package com.devoir1C306;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * classe ecrite pour tester les quatres methodes.
 * @author philemon
 * */
public class TestTabAlgos {

/**
 * Definition de la constante 1 pour eviter les "magic numbers".
 * */
public static final int UN = 1;
/**
 * Definition de la constante 2 pour eviter les "magic numbers".
 * */
public static final int DEUX = 2;
/**
 * Definition de la constante 3 pour eviter les "magic numbers".
 * */
public static final int TROIS = 3;
/**
 * Definition de la constante 4 pour eviter les "magic numbers".
 * */
public static final int QUATRE = 4;
/**
* Methode test pour verifier que le max du tableau a ete identifie correctement
* par la methode plusGrand() de TabAlgos.
* */
@Test
public void testPlusGrand() {
int[] tab = {UN, QUATRE, DEUX, TROIS};
assertEquals(QUATRE, TabAlgos.plusGrand(tab));
}

/**
* Methode test pour verifier que le calcul de la moyenne a ete correctement
* effectue dans TabAlgos.
* */
@Test
public void testMoyenne() {
int[] tab = {UN, DEUX, TROIS, QUATRE};
assertEquals(DEUX, TabAlgos.moyenne(tab));
}

/**
* methode test pour verifier que 2 tableaux ordonnes ont ete correctement
* identifie par TabAlgos.
* */
@Test
public void testEgaux() {
int[] tab1 = {UN, DEUX, TROIS, QUATRE};
int[] tab2 = {UN, DEUX, TROIS, QUATRE};
assertEquals(true, TabAlgos.egaux(tab1, tab2));
}

/**
* methode test pour verifier que 2 tableaux similaires ordonnes ou non on
* ete correctement identifie par TabAlgos.
* */
@Test
public void testSimilaires() {
int[] tab1 = {UN, DEUX, TROIS, QUATRE};
int[] tab2 = {UN, TROIS, DEUX, QUATRE};
assertEquals(true, TabAlgos.similaires(tab1, tab2));
}

}
