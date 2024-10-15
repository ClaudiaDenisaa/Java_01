package _2_;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class test_2_ {
    @Test
    public void test_adaugare() {
        Container container = new Container(1, 3);
        Produs produs1 = new Produs("Paine", 4.45, 21);
        container.adaugare(produs1, 0);

        assertEquals(produs1, container.getProdus()[0]); //verifica ca produsul a fost adaugat
        assertEquals(21, container.getNrCantTotal());//verifica cantitatea corecta

        Container container1 = new Container(2, 3);
        Produs produs = new Produs("Covrigi", 2.75, 15);
        container1.adaugare(produs, -1);
        assertNull(container1.getProdus()[0]);//produsul nu a fost adaugat
        assertEquals(0, container1.getNrCantTotal());

        Container container3 = new Container(3, 3);
        Produs produs3= new Produs("Corn cu ciocolata", 7.00, 30);
        container3.adaugare(produs3, 5);
        for (Produs p : container3.getProdus()) {
            assertNull(p);
        }
        assertEquals(0, container3.getNrCantTotal());//verif ca cantitatea totala este 0

        Container container4 = new Container(4, 3);
        Produs pprodus1 = new Produs("Paine", 4.45, 21);
        Produs pprodus2 = new Produs("Merdenea", 5.00, 15);

        container4.adaugare(pprodus1, 0);// Adaugam produsul 1 la indexul 0
        container4.adaugare(pprodus2, 0);// Incercam sa adaugam produsul 2 in aceeasi pozitie
        assertEquals(pprodus1, container4.getProdus()[0]); // Verificam ca produsul 1 ramane in pozitia 0 (adaugarea nu are loc)
        assertNotEquals(pprodus2, container4.getProdus()[0]); // Verificam ca produsul 2 nu a fost adaugat in aceeasi pozitie
        assertEquals(21, container4.getNrCantTotal());// Verificam ca nrCantTotal nu s-a schimbat

    }

}
