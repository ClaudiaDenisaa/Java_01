package _2_;

import java.util.Arrays;
import java.util.Objects;

public class Produs {
    /**
     * NUMELE
     */
    public String nume;
    /**
     * PRETUL
     */
    public double pret;
    /**
     * CANTITATEA
     */
    public int cant;

    /**
     * Constructor Produs
     * @param n nume
     * @param p pret
     * @param c cantitate
     */
    Produs(String n,double p,int c){
        nume = n;
        pret = p;
        cant = c;
    }

    /**
     * Afisarea produsului
     * @return nume,pret,cantitate
     */
    @Override
    public String toString() {
        if(Objects.equals(nume,null)) return "-";
        return "Produsul " + nume + " are pretul " + pret + " si cantitatea " + cant +"\n";
    }

    /**
     * @return cantitatea unui produs
     */
    public int getCant(){
        return cant;
    }

    /**
     * @param c seteaza cantitatea unui produs
     */
    public void setCant(int c) {
        this.cant = c;
    }

}
