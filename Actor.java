package _1_;


/**
 * param nume(privat)
 * param prenume(privat)
 * param an(pachet)-anul nasterii
 * param scoala(pachet)-scoala la care (nu) a fost
 *
 */
public class Actor {
    private String nume;
    private String prenume;
    int an;
    String scoala;

    /**
     * constructor fara parametrii
     */
    public Actor(){}

    /**
     * Constructor pentru totii parametrii
     * @param n - nume
     * @param p - prenume
     * @param a - an
     * @param s - scoala
     */
    public Actor(String n,String p,int a,String s) {
        this.nume = n;
        this.prenume = p;
        this.an = a;
        this.scoala = s;
    }

    /**
     * Metoda statica pentru numararea tuturor actoriilor existenti
     */
    static int nrActori = 0;

    /**
     * Constructor pentru actorii care nu au scoala
     * @param n - nume
     * @param p - prenume
     * @param a - an
     */
    public Actor(String n,String p,int a){
        this.nume = n;
        this.prenume = p;
        this.an = a;
        this.scoala = "FARA SCOALA";
        nrActori++ ;
    }

    /**
     * Metoda de afisare a actorilor
     * @return un string cu informatii
     */
    @Override
    public String toString() {
        return  nume + " " + prenume + " " + an + " " + scoala;
    }

    /**
     * @return numele
     */
    public String getNume() {
        return nume;
    }
    /**
     * Seteaza numele
     * @param nume
     */
    public void setNume(String nume) {
        this.nume = nume;
    }
    /**
     * @return prenumele
     */
    public String getPrenume() {
        return prenume;
    }

    /**
     * Seteaza prenumele
     * @param prenume
     */
    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }
    /**
     * @return an
     */
    public int getAn() {
        return an;
    }

    /**
     * Seteaza anul
     * @param an
     */
    public void setAn(int an) {
        this.an = an;
    }
    /**
     * @return scoala
     */
    public String getScoala() {
        return scoala;
    }

    /**
     * Seteaza scoala
     * @param scoala
     */
    public void setScoala(String scoala) {
        this.scoala = scoala;
    }

    /**
     *Afla numarul de actori dintr un interval dat in terminal
     * @param tab
     * @param args0 - inceputul intervalului
     * @param args1 - sfarsitul intervalului
     * @return numarul
     */
    public static int intervalActori(Actor[] tab,int args0,int args1){
        int nr=0;
        for(Actor a : tab){
            if(a != null && a.getAn() >= args0 && a.getAn() <= args1){
                nr++;
            }
        }
        return nr;
    }

}

