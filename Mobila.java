package t_1_;

public class Mobila {
    public String nume;
    public String descrie;
    public String material;
    public double L;
    public double l;
    public double h;
    public double pret;

    /**
     * Constructor
     * @param nume
     * @param descrie
     * @param material
     * @param L lungime
     * @param l latime
     * @param h inaltime
     * @param pret
     */
    Mobila(String nume, String descrie, String material, double L, double l, double h, double pret) {
        this.nume = nume;
        this.descrie = descrie;
        this.material = material;
        this.L = L;
        this.l = l;
        this.h = h;
        this.pret = pret;
    }

    /**
     * @return pretul mobilei
     */
    public double getPret(){
        return pret;
    }

    /**
     * @return mobila
     */
    @Override
    public String toString() {
        return nume + ',' + descrie + ", material='" + material + ", Lungime=" + L + ", latime="
                + l + ", inaltime=" + h + ", pret " + pret + '\n';
    }

}

