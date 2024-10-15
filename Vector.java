package s_1_;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class Vector {
    /**
     * Un tablou v de tip int
     */
    private int[] v;

    /**
     *Constructor,creem un vector v cu dimensiunea dim cu elem 0
     * @param dim dimensiunea lui v
     */
    Vector(int dim){
        v = new int[dim];//elemente 0
    }

    /**
     * Constructor,creem un vector v cu dimensiunea dim cu elem valori
     * @param valori primeste un tablou de elemnete care le afdauga in vector
     */
    Vector(int[] valori){
        v = new int[valori.length];
        System.arraycopy(valori, 0, v, 0, valori.length);
    }

    /**
     * Inmultirea unui vector cu o constanta
     * @param c constanta
     * @return vector * constanta
     */
    public Vector multiConstanta(int c){
        for(int i=0;i<v.length;i++) v[i]=c*v[i];
        return this;
    }

    /**
     * @return lungimea
     */
    public int lungime(){
        return v.length;
    }

    /**
     * @param i pozitia
     * @return valoarea de pe pozitia i
     */
    public int getElem(int i){
        return v[i];
    }

    /**
     * @return tot tabloul v
     */
    public int[] getVector(){
        return v;
    }
    /**
     * Insereaza o valoare pe o pozitie
     * @param i pozitia
     * @param val valoarea inserata in vector
     */
    public Vector setElem(int i, int val) {
        if(i>=0 && i<v.length)  v[i] = val;
        else System.out.println("Indexul e inafara limitei!");
        return this;
    }

    /**
     * Adunarea a doi vectori
     * @param vDat un vector
     * @return un vector
     */
    public Vector adunare(Vector vDat){
       int k;
        if(v.length > vDat.lungime()) {
            k = v.length;
        }
        else k=vDat.lungime();

        Vector vNou = new Vector(k);
        int val1,val2,j=0;
       for(int i=0;i<k;i++){
           if(i<vDat.lungime() && i<v.length) j = v[i] + vDat.getElem(i);
           else if(i>vDat.lungime() || i<v.length) j= v[i] ;
           else if(i<vDat.lungime() || i>v.length) j = vDat.getElem(i) ;
           vNou.setElem(i,j);
       }
       return vNou;
    }

    /**
     * @return media aritmetica a elementelor din vector
     */
    public double ma(){
        double suma=0;
        int n = v.length;
        for(int e : v){
            suma +=e;
        }
        double ma = suma / n;
        return ma;
    }

    /**
     * Adauga elementele intr un set pentru a ramane doar elementele unice iar apoi le pune intr o matrrice
     * @return matrice cu elem unice
     */
    public int[] valUnice(){
        Set<Integer> set = new HashSet<>();
        for (int i : v){
            set.add(i);
        }
        int[] matrice = new int[set.size()];
        int j=0;
        for(int elem : set){
            matrice[j]=elem;
            j++;
        }
        return matrice;
    }

    /**
     * @return un vector
     */
    @Override
    public String toString() {
            return Arrays.toString(v);
        }

}
