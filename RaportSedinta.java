package tema;
import java.util.List;
import java.util.Date;
import java.time.LocalDate;

/**
 * Clasa RaportSedinta care are ca interfata Raport
 */
public class RaportSedinta implements Raport{
    private String motiv;
    private LocalDate data;
    private List<String> subiecte;
    private String[] minuta;
    private String[] pers;

    /**
     * Constructor
     * @param motiv motivul sedintei
     * @param data data sedintei
     * @param subiecte subiectele sedintei
     * @param minuta minuta sedintei
     * @param pers persoanele responsabile de sedinta
     */
    RaportSedinta(String motiv, LocalDate data, List<String> subiecte, String[] minuta, String[] pers) {
        this.motiv = motiv;
        this.data = data;
        this.subiecte = subiecte;
        this.minuta = minuta;
        this.pers = pers;
    }

    /**
     * @return data
     */
    public LocalDate getData(){
        return data;
    }

    /**
     * @return motiv si sedinta
     */
    public String generareTitlu(){
        return "Motiv sedinta: " + motiv + "\nData sedintei: " + data;
    }

    /**
     * @return subiectele discutate in sedinta
     */
    public String generareContinut(){
        StringBuilder continut = new StringBuilder("\nSubiecte:\n");
        for(String s : subiecte){
            continut.append(s);
            continut.append("\n");
        }
        continut.append("\nMinuta sedintei:\n");
        for(String m : minuta){
            continut.append(m);
            continut.append("\n");
        }
        return continut.toString();
    }

    /**
     * @return persoanele responsabile
     */
    public String generareIncheiere(){
        return "Persoanele responsabile: " + String.join(", ", pers);
    }
}
