package _3_;

public class Nr_complex {
    public double re;
    public double im;

    /**
     * Constructor cu re = 0, im = 0
     */
    Nr_complex(){
        re = 0;
        im = 0;
    }

    /**
     * Constructor cu parte reala
     * @param re
     */
    Nr_complex(double re){
        this.re = re;
        this.im = 0;
    }

    /**
     * Constructor
     * @param re real
     * @param im imaginar
     */
    Nr_complex(double re, double im){
        this.re = re;
        this.im = im;
    }

    /**
     * Afisarea
     */
    @Override
    public String toString() {
        if (im == 0) {
            return re + "";
        } else if (im > 0) {
            return re + " + " + im + " i";
        } else {
            return re + " " + im + " i";
        }
    }

    /**
     * @return modulul unui nr complex
     */
    public  double modul(){
        return Math.sqrt(re*re + im*im);
    }

    /**
     * Adunare
     * @param n numarul complex cu care se aduna
     * @return un nr complex rezultat din adunarea a doua numere complexe
     */
    public Nr_complex adunare(Nr_complex n){
        Nr_complex x = new Nr_complex(n.re+this.re,n.im+this.im);
        return x;
    }

    /**
     * Produs
     * @param n numarul complex cu cvare se inmulteste this
     * @return n nr complex rezultat din produsul a doua numere complexe
     */
    public Nr_complex produs(Nr_complex n){
        Nr_complex x = new Nr_complex(n.re*this.re,n.im*this.im);
        return x;
    }
}
