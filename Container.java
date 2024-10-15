package _2_;
import java.util.Arrays;
import java.util.Objects;

public class Container {
    /**
     * Tablou de produse
     */
    public Produs[] produse;
    /**
     * Id-ul containerului
     */
    private int id;

    /**
     * @return produsele dintr un container
     */
    public Produs[] getProdus() {
        return produse;
    }

    /**
     * @param produse
     */
    public void setProduse(Produs[] produse) {
        this.produse = produse;
    }

    /**
     * Numarul total de produse efectiv(un fel de produs are o cantitate x),deci nr total..
     */
    public static int nrCantTotal = 0;

    public int getNrCantTotal() {
        return nrCantTotal;
    }

    /**
     * Pretul tuturor produselor din container
     */
    // public static double pretTotalProduse = 0;

    /**
     * Constructor pentru container
     * @param i pozitia din tablou
     * @param l lungimea tabloului
     */
    Container(int i,int l){
        this.id = i;
        this.produse = new Produs[l];
    }

    /**
     * Adaugam un produs nou in container
     * @param p
     * @param i
     */
    public void adaugare(Produs p,int i){
        if(this.produse[i] == null && i >= 0 && i < this.produse.length){
            produse[i] = p;
            nrCantTotal += p.getCant();
        }
    }

    /**
     * Eliminam produsul i
     * @param i index produs in tablul de produse din container
     */
    public void eliminare(int i){
        if(i >= 0 && i < this.produse.length) {
            produse[i] = null;
            nrCantTotal -= produse[i].getCant();
        }
    }

    /**
     *Schimbam adaugand cantitatea c unui produs cu numele n
     * @param n numele unui produs dat din LINIA DE COMANDA
     * @param c cantitatea pe care o adaugam
     */
    public void setCantitate(String n,int c){
        for (Produs produs : this.produse) {
            if (Objects.equals(produs.nume, n)) produs.cant += c;
        }
    }

    /**
     * Modificam cantitatea unui singur produs
     * @param p produsul la acre i modificam cantitatea
     * @param cNoua noua cantitate
     */
    public void modificCantitate(Produs p,int cNoua){
        int dif;
        if(cNoua > p.getCant())  {
            dif = cNoua - p.getCant();
            nrCantTotal += dif;
        }
        else {
            dif = cNoua - p.getCant();
            nrCantTotal -= dif;
        }
        p.setCant(cNoua);
    }

    /**
     * Calculeaza pretul tuturor produselor din container
     * @return prretul total de tip double
     */
    public double pretTotal(){
        double T = 0;
        for(int i=0;i<produse.length;i++){
            if(produse[i] != null){
                T = produse[i].pret*produse[i].cant;
            }
        }
        return T;
    }

    /**
     * @return containerul cu produsele
     */
    @Override
    public String toString() {
        if(Objects.equals(Arrays.toString(produse),null)) return "-";
        else  return "Containerul cu id-ul:" + id + " contine produsele: \n" + Arrays.toString(produse) + '}';

    }


}
