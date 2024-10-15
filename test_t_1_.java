package t_1_;

import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Assertions.*;

//import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class test_t_1_ {
    @Test
    public void testMagazinIeftin(){

        Magazin[] magazine = new Magazin[0];
        String rez =Magazin.magazinIeftin(magazine);
        assertNull(rez);

        Magazin mag1 = new Magazin("Dedeman","Arad,nr. 249",2);
        Magazin[] magazine1 = {mag1};
        String rezultat = Magazin.magazinIeftin(magazine1);
        assertEquals("Magazin 1", rezultat);

    }

    @Test
    public void testNrMobileCuDescriereX(){
        List<String> d1 = Arrays.asList("Dulap","de","stejar");
        Magazin ma1 = new Magazin("Brico","Timisoara,nr. 200",2);
        Mobila mm1 = new Mobila("Dulap","Dulap de stejar","lemn",1.60,0.4,2,300);
        Mobila mm2 = new Mobila("Scaun","Dulap de stejar","lemn",0.4,0.4,2,0.6);
        ma1.addMobila(mm1);
        ma1.addMobila(mm2);
        int r2 = ma1.nrMobileCuDescriereX(d1);
        assertEquals(2,r2);
    }

}
