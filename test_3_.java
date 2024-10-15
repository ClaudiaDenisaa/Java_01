package _3_;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
public class test_3_ {

    @Test
    public void testModul() {
        Nr_complex nr3 = new Nr_complex(3,6);
        Nr_complex nr4 = new Nr_complex(-3);
        double d1 = nr3.modul();
        String f1 = String.format("%.2f",d1);
        assertEquals("6,71",f1);
        double d2 = nr4.modul();
        String f2 = String.format("%.2f",d2);
        assertEquals("3,00",f2);
    }

    @Test
    public void testAdunare(){
        Nr_complex nr1 = new Nr_complex();
        Nr_complex nr2 = new Nr_complex(4);
        Nr_complex nr3 = new Nr_complex(3,6);
        Nr_complex nr4 = new Nr_complex(-4,-5.21);
        Nr_complex nr5 = new Nr_complex();

        Nr_complex t1 = nr1.adunare(nr2);
        assertEquals("4.0",t1.toString());
        Nr_complex t2 = nr3.adunare(nr4);
        assertEquals("-1.0 + 0.79 i",t2.toString());
        Nr_complex t3 = nr1.adunare(nr5);
        assertEquals("0.0",t3.toString());
    }

    @Test
    public void testProdus(){
        Nr_complex nr1 = new Nr_complex();
        Nr_complex nr2 = new Nr_complex(4);
        Nr_complex nr3 = new Nr_complex(3,6);
        Nr_complex nr4 = new Nr_complex(-4,-5);
        Nr_complex nr5 = new Nr_complex();

        Nr_complex t1 = nr1.produs(nr2);
        assertEquals("0.0",t1.toString());
        Nr_complex t2 = nr1.produs(nr4);
        assertEquals("0.0",t1.toString());
        Nr_complex t3 = nr3.produs(nr4);
        assertEquals("-12.0 -30.0 i",t3.toString());
    }
}
