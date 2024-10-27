package tema;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {

        List<String> autori = new ArrayList<>();
        autori.add("Ion Ionescu");
        autori.add("Maria Anghelescu");
        autori.add("Alex Petrescu");
        String[] sectiuni = {"Introducere", "Continut introducere...", "Cuprins", "Continut cuprins...", "Incheiere", "Continut incheiere..."};
        List<String> bibliografie = new ArrayList<>();
        bibliografie.add("www.google.com");
        bibliografie.add("www.articolcool.ro");

        ArticolStiintific a1 = new ArticolStiintific("Muzica contemporala", autori, sectiuni, bibliografie);

        List<String> subiecte = new ArrayList<>();
        subiecte.add("Genuri muzicale");
        subiecte.add("Artistii");
        subiecte.add("Identificarea publicului");
        String[] minuta = {"0.0", "1.2", "3.0"};
        String[] pers = {"Maria Ianovici", "Raluca Mare"};
        //Date d1 = new Date(2014, 11, 01);
        RaportSedinta r1 = new RaportSedinta("Proiect Arta Muzicala", LocalDate.of(2014, 11, 1), subiecte, minuta, pers);


        List<String> autori2 = new ArrayList<>();
        autori2.add("Ion Ionescu");
        autori2.add("Maria Anghelescu");
        autori2.add("Alex Petrescu");
        String[] sectiuni2 = {"Introducere", "Continut introducere...", "Cuprins", "Continut cuprins...", "Incheiere", "Continut incheiere..."};
        List<String> bibliografie2 = new ArrayList<>();
        bibliografie2.add("www.google.com");
        bibliografie2.add("www.anatomiaumana.ro");

        ArticolStiintific a2 = new ArticolStiintific("Ochiul uman", autori2, sectiuni2, bibliografie2);


        List<String> subiecte2 = new ArrayList<>();
        subiecte2.add("Structura ochiului");
        subiecte2.add("Bolile");
        subiecte2.add("Tehnici si aparatura");
        subiecte2.add("Ce imbunatatiri se pot aduce pentru aparatura?");
        String[] minuta2 = {"10.0", "1.2", "30.0"};
        String[] pers2 = {"Maria Ianovici", "Raluca Mare"};
        //Date d2 = new Date(2014, 11, 01);

        RaportSedinta r2 = new RaportSedinta("Conferinta", LocalDate.of(2014, 11, 1), subiecte2, minuta2, pers2);


        Raport[] tab = new Raport[4];
        tab[0] = r1;
        tab[1] = a1;
        tab[2] = r2;
        tab[3] = a2;

        Rapoarte tabRapoarte = new Rapoarte(tab);

        for (Raport r : tab) {
            System.out.println(r.generareTitlu());
            System.out.println(r.generareContinut());
            System.out.println(r.generareIncheiere());
            System.out.println("\n\n\n");
        }

        int nrArt = Rapoarte.numarArticole(tab);
        System.out.println("Numarul de articole stiintifice din tablou este de: " + nrArt);

        LocalDate sedinteMulte = tabRapoarte.DATAceleMaiMulteSedinte();
        System.out.println("Data cu cele mai multe ședințe este: " + sedinteMulte);
    }

}
