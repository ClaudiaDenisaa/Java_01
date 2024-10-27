package tema;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class test {

    @Test
    public void test() {

        //verific cazurile in care sunt stringuri null sau liste goale

       String[] s1 = {"Instr1","Instr3"};

      List<String> a1 = new ArrayList<>();
      List<String> b1 = new ArrayList<>();
      ArticolStiintific articol1 = new ArticolStiintific("",a1,s1,b1);
        assertNull(null, articol1.generareTitlu());
        assertNull(null, articol1.generareContinut());
        assertNull(null,articol1.generareIncheiere());


       a1.add("Autor1");
       a1.add("Autor2");
       b1.add("www.ceva.com");

        ArticolStiintific articol = new ArticolStiintific("Titlul", a1, s1, b1);
       //verific daca s a construit corect articolul
        assertEquals("Titlul articolului: \nAutori: Autor1, Autor2", articol1.generareTitlu());



        //verific pentru raport sedinta:
        List<String> s2 = new ArrayList<>();
        String[] m2 = {};
        String[] p2 = {};

        RaportSedinta raport = new RaportSedinta("", LocalDate.now(), s2, m2, p2);

        assertEquals("Motiv sedinta: \nData sedintei: " + LocalDate.now(), raport.generareTitlu());
        assertEquals("\nSubiecte:\n\nMinuta sedintei:\n", raport.generareContinut());
        assertEquals("Persoanele responsabile: ", raport.generareIncheiere());

        s2.add("subiect1");
        s2.add("subiect2");
        String[] m3 = {"11", "12", "13"};
        String[] p3 = {"Alexandra", "Ioana"};

        RaportSedinta raport2 = new RaportSedinta("", LocalDate.now(), s2, m3, p3);
        assertEquals("Motiv sedinta: \nData sedintei: 2024-10-23", raport2.generareTitlu());
        assertEquals("\nSubiecte:\nsubiect1\nsubiect2\n\nMinuta sedintei:\n11\n12\n13\n",raport2.generareContinut());
        assertEquals("Persoanele responsabile: ", raport.generareIncheiere());

        //teste pentru nr de articole
        Raport[] tab = {};
        Rapoarte rr1 =new Rapoarte(tab);
        assertEquals(0, Rapoarte.numarArticole(tab)); //cand nu exista articole
        Raport[] tab2 = new Raport[3];
        tab2[0]=raport;
        assertEquals(0, Rapoarte.numarArticole(tab2)); //cand nu exista articole in raport dar exista un raportsedinta
        tab2[1]=articol1;
        assertEquals(1, Rapoarte.numarArticole(tab2));//cand exista articole

        //test pentru metoda DATAceleMaiMulteSedinte
        Rapoarte tabRapoarte = new Rapoarte(tab2);
        assertEquals(LocalDate.now(),tabRapoarte.DATAceleMaiMulteSedinte());
    }

}
