package tema;
import java.util.HashMap;
import java.util.Date;
import java.time.LocalDate;

/**
 * Clasa pentru Raport care contine un tablou de rapoarte care sunt ArticoleStiintifice sau RapoarteSedinta si implementeaza metode pe date din tablou
 */
public class Rapoarte {
    /**
     * Constructor Raport care are un tablou de obiecte
     */
    private Raport[] tab;

    /**
     * Constructor
     * @param tab tablou de rapoarte(de tip ArticolStiintific sau RaportSedinta pentru ca au ca interfata Raport)
     */
    Rapoarte(Raport[] tab) {
        this.tab = tab;
    }

    /**
     * Numara cate articole sunt in tablou
     * @param tab tablou de rapoarte
     * @return un in, numarul articolelor
     */
    public static int numarArticole(Raport[] tab) {
        int nr = 0;
        for (Raport r : tab) {
            if (r instanceof ArticolStiintific) {
                nr++;
            }
        }
        return nr;
    }

    /**
     * Calculeaza data in care sunt cele mai multe sedinte
     * @return o data de tip LocalDate
     */
    public LocalDate DATAceleMaiMulteSedinte(){
        HashMap<LocalDate,Integer> map = new HashMap<>();
        for (Raport r : tab) {
            if(r instanceof RaportSedinta){
                LocalDate d = ((RaportSedinta) r).getData();
                map.put(d, map.getOrDefault(d,0)+1);
            }
        }
        LocalDate dataFrecventa = null;
        int nrMax = 0;

        for(HashMap.Entry<LocalDate,Integer> k : map.entrySet()){
            if(k.getValue() > nrMax){
                dataFrecventa = k.getKey();
                nrMax = k.getValue();
            }
        }
        return dataFrecventa;
    }

}
