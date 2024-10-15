package s_2_;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Ochelari {
    String prod;
    double pret;
    String tip;

    /**
     * Constructor
     * @param pr producator
     * @param p pret
     * @param t tip
     */
    Ochelari(String pr,double p, String t){
        this.prod = pr;
        this.pret = p;
        this.tip = t;
    }

    /**
     * @return producatorul
     */
    public String getProducator() {
        return prod;
    }

    /**
     * @return pretul
     */
    public double getPret(){
        return this.pret;
    }

    /**
     * @return tipul
     */
    public String getTip() {
        return tip;
    }

    /**
     *Perechea de ochelari care e cea mai ieftina
     * @param tab tabloul de ochelari
     * @return perechea cu cel mai mic pret(prima care o gaseste)-daca sunt mai multe care au acelasi
     * pret minim atunci trebuie sa folosim un ArrayList ca sa returmnam mai multe perechi
     */
    public static Ochelari celMaiIeftin(Ochelari[] tab){
        Ochelari oIeftin = tab[0];
        for(Ochelari o : tab){
            if(oIeftin.getPret() > o.getPret()){
                oIeftin = o;
            }
        }
        return oIeftin;

    }

    /**
     * @param tab
     * @return o mapa cu producatorii si numarul de ochelari pe care i au produs
     */
    public static Map<String,Integer> nrOchelariProducatori(Ochelari[] tab){
        Map<String,Integer> map =new HashMap<>();
        for(Ochelari o : tab){
            map.put(o.getProducator(),map.getOrDefault(o.getProducator(),0)+1);
        }
        return map;
    }

    /**
     * Ochelarii care au un tip pe care l ceri
     * @param tab
     * @param tipul
     * @return o lista cu ochelari de un anumit tip
     */
    public static ArrayList<Ochelari> dupaTip(Ochelari[] tab,String tipul){
        ArrayList<Ochelari> lista = new ArrayList<>();
        for(Ochelari o : tab){
            if(o.getTip().equals(tipul)){
              lista.add(o);
            }
        }
        return lista;
    }

    /**
     * @return afisare
     */
    @Override
    public String toString() {
        return "Producator:" + prod + " pret:" + pret + " tip:" + tip;
    }
}
