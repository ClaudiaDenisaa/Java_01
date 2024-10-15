package _1_;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;
        import static org.junit.jupiter.api.Assertions.assertEquals;

public class test_1_ {

    @Test
    public void testNrActori() {
        assert(Actor.nrActori == 0) : "ESEC!NUMARUL TREBUIA SA FIE 0.";
        Actor a1 = new Actor();
        Actor a2 = new Actor("Ionescu","Dan",1990,"Scoala1");
        Actor a3 = new Actor("Petrescu","Ion",1996);
        Actor a4 = new Actor("Scoala","Dan",1995);
        Actor a5 = new Actor("Petrescu","Dan",1994,"Scoala2");
        Actor a6 = new Actor();
        Actor a7 = new Actor("Sergius","Dan",1995);
        Actor[] tab = new Actor[10];
        tab[0] = a1;
        tab[1] = a2;
        tab[2] = a3;
        tab[3] = a4;
        tab[4] = a5;
        tab[5] = a6;
        tab[6]= a7;
        assert(Actor.nrActori == 3):"ESEC! NUMARUL TREBUIE SA FIE 3";

        Actor a8 = new Actor("Petrescu","Dan",1985);
        Actor a9 = new Actor("Sergius","Cosmin",1998);
        tab[7] = a8;
        tab[8] = a9;
        System.out.println(Actor.nrActori);
        assert(Actor.nrActori == 5) : "ESEC! NUMARUL TREBUIE SA FIE 5";
    }

    @Test
    public void testActoriInterval(){
        Actor a1 = new Actor();
        Actor a2 = new Actor("Ionescu","Dan",1990,"Scoala1");
        Actor a3 = new Actor("Petrescu","Ion",1996);
        Actor a4 = new Actor("Scoala","Dan",1995);
        Actor a5 = new Actor("Petrescu","Dan",1994,"Scoala2");
        Actor a6 = new Actor();
        Actor a7 = new Actor("Sergius","Dan",1995);
        Actor[] tab = new Actor[10];
        tab[0] = a1;
        tab[1] = a2;
        tab[2] = a3;
        tab[3] = a4;
        tab[4] = a5;
        tab[5] = a6;
        tab[6]= a7;

        int test1 = Actor.intervalActori(tab,1880,1889);
        assert(test1 == 0) : "Trebuie sa fie 0";
        int test2 = Actor.intervalActori(tab,1990,1996);
        assert(test2 == 5) : "Trebuie sa fie 5";

    }

}
