package t_1_;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Magazin {
    public String nume;
    public String adresa;
    public static Mobila[] tab;
    public int numarul_de_mobile;

    Magazin(String nume, String adresa, int capacitate) {
        this.nume = nume;
        this.adresa = adresa;
        tab = new Mobila[capacitate];
        this.numarul_de_mobile=0;
    }

    public void addMobila(Mobila m) {
        if (numarul_de_mobile < tab.length) {
            tab[numarul_de_mobile] = m;
            numarul_de_mobile++;
        } else {
            System.out.println("Tabloul de mobila este plin! Nu se mai poate adauga mobila.");
        }
    }

    public int nrMobileCuDescriereX(List<String> cuvant){
        int nr=0;
        boolean ok;
        for(Mobila m : tab) {
            if (m != null) {
                ok = true;
                for (String unCuvant : cuvant) {
                    if (!m.descrie.contains(unCuvant)) {
                        ok = false;
                        break;
                    }
                }

                if (ok) {
                      nr++;
                }
           }
        }
        return nr;
    }/*
    public int nrMobileCuDescriereX(List<String> cuvant) {
        int nr = 0;
        boolean ok;

        // Parcurgem fiecare magazin din array
        for (Magazin magazin : mag) {
            if (magazin != null) {  // Verificăm dacă magazinul nu este null
                for (Mobila m : magazin.tab) {  // Accesăm lista de mobiliare din magazin
                    if (m != null) {  // Verificăm dacă mobila nu este null
                        ok = true;
                        for (String unCuvant : cuvant) {
                            if (!m.descrie.contains(unCuvant)) {
                                ok = false;
                                break;
                            }
                        }
                        if (ok) {
                            nr++;
                        }
                    }
                }
            }
        }
        return nr;
    }
*/

    public String getNumeMagazin(){
        return nume;
    }

    public static double pretTotal(Magazin mag){
        double total = 0;
        for(Mobila mobila : tab){
            total += mobila.getPret();
        }
        return total;
    }

    public static String magazinIeftin(Magazin[] magazin){
        Map<String,Double> map = new HashMap<>();
        for(Magazin m : magazin){
            map.put(m.getNumeMagazin(),pretTotal(m));
        }
        double min = Integer.MAX_VALUE;
        for(Map.Entry<String,Double> acces : map.entrySet()){
            if(min > acces.getValue()){
                min = acces.getValue();
            }
        }
        for(Map.Entry<String,Double> acces : map.entrySet()){
            if( min == acces.getValue()){
                return acces.getKey();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Magazinul " + nume + " cu adresa '" + adresa +
                " are urmatoarele produse =>\n" + Arrays.toString(tab) +
                "\n - numarul de produse este de " + numarul_de_mobile + " bucati \n";
    }
}
