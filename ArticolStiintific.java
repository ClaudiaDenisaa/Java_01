package tema;
import java.util.List;
import java.util.ArrayList;

/**
 * Clasa ArticolStiintific care are ca interfata Raport
 */
public class ArticolStiintific implements Raport{
    private String titluArticol;
    private List<String> autori;
    private String[] sectiuni;
    private List<String> bibliografie;

    /**
     * Constructor
     * @param titluArticol titlul articolului
     * @param autori autorii articolului
     * @param sectiuni sectiunile articolului(titlu si continutul)
     * @param bibliografie site-urile de unde s-au inspirat
     */
    ArticolStiintific(String titluArticol, List<String> autori, String[] sectiuni, List<String> bibliografie) {
        this.titluArticol = titluArticol;
        this.autori = autori;
        this.sectiuni = sectiuni;
        this.bibliografie = bibliografie;

    }

    /**
     * Genereaza Titlul si autorii - antetul
     * @return null - daca nu este titlu sau autori
     * sau return titlul si autorii
     */
    public String generareTitlu(){
        if (titluArticol == null || autori == null || autori.isEmpty()) return null;
        else return "Titlul articolului: " + titluArticol + "\nAutori: " + String.join(", ",autori);
    }

    /**
     * Generarea continutului articolului
     * @return null daca sectiuniile sunt goale sau daca nu,return partea de sectiuni
     */
    public String generareContinut(){
        if (sectiuni == null || sectiuni.length == 0) return null;
        StringBuilder sirContinut = new StringBuilder("\nSectiunile:\n");
        for(String s : sectiuni){
            sirContinut.append(s);
            sirContinut.append("\n");
        }
        return sirContinut.toString();
    }

    /**
     * Generarea bibliografiei articolului
     * @return null daca nu este bibliografie sau bibliografia daca exista
     */
    public String generareIncheiere(){
        if (bibliografie == null ||  bibliografie.isEmpty()) return null;
        StringBuilder cont = new StringBuilder("Bibliografie:\n");
        for(String b : bibliografie){
            cont.append(b);
            cont.append("\n");
        }
        return cont.toString();
    }
}
