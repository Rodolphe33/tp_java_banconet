package com.banconet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CompteCourantTest {

    private final CompteCourant compteCourant1 = new CompteCourant();
    private final CompteCourant compteCourant2 = new CompteCourant();
    private final CompteCourant compteCourant3 = new CompteCourant();

    @Test
    void addition() {
        // assertEquals(2, numero.add(1, 1));
        System.out.println("cc");
    }

    @Test
    void nombreCompteCourant() {
        assertEquals(CompteCourant.nbComptesCourant, 0);
    }
}
