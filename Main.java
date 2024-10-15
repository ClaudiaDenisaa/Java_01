package t_1_;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Mobila m1 = new Mobila("Dulap","Dulap alb","lemn",1.60,0.4,2,300);
        Mobila m2 = new Mobila("Scaun","Scaun tapitat","lemn",0.4,0.4,2,0.6);
        Mobila m3 = new Mobila("Birou","Birou alb","lemn",1.0,0.4,0.6,160);
        Mobila m4 = new Mobila("Dulap","Dulap maro","lemn stejar",1.60,0.4,2,399.99);
        Mobila m5 = new Mobila("Scaun","Scaun alb","lemn",1.0,0.4,0.6,54.99);
        Mobila m6 = new Mobila("Birou","Dulap alb","lemn",0.8,0.4,1,200);

        Magazin mag1 = new Magazin("Dedeman","Arad,nr. 249",2);
        Magazin mag2 = new Magazin("Brico","Timisoara,nr. 200",2);
        Magazin mag3 = new Magazin("BricoStore","Oradea,nr. 169",2);

        mag1.addMobila(m1);
        mag1.addMobila(m2);
        mag2.addMobila(m3);
        mag2.addMobila(m4);
        mag3.addMobila(m5);
        mag3.addMobila(m6);

        Magazin[] tab_magazine = new Magazin[3];
        tab_magazine[0] = mag1;
        tab_magazine[1] = mag2;
        tab_magazine[2] = mag3;

        for(Magazin m : tab_magazine){
            System.out.println(m);
        }

        //System.out.println(mag1.magazinIeftin(tab_magazine));  //daca metoda magazinIeftin nu e statica
        System.out.println(Magazin.magazinIeftin(tab_magazine) + " este magazinul cu cele mai ieftine produse"); //metoda e statica

        List<String> descriere = Arrays.asList("Dulap","alb");
        int nrTotal = 0;
        for (Magazin magazin : tab_magazine) {
            nrTotal += magazin.nrMobileCuDescriereX(descriere);
        }
        String d =String.join(" ", descriere);
        System.out.println("\nNumarul total de magazine cu descrierea: \"" + d+ "\" este: " + nrTotal);
    }
}
