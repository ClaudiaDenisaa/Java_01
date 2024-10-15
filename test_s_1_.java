package s_1_;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
public class test_s_1_ {
    @Test
    public void test() {
        int[] ve1 = {1,2,3,4};
        Vector v1 = new Vector(ve1);
        int[] ve2 = {-1,0,3,4};
        Vector v2 = new Vector(ve2);
        int[] ve3 = {3,4};
        Vector v3 = new Vector(ve3);

        assert Arrays.equals(v2.getVector(),new int[]{-1, 0, 3, 4}) : "Test esuat!";
        assert Arrays.equals(v1.getVector(),new int[]{1, 2, 3, 4}) : "Test esuat";

        Vector r1 = v1.adunare(v2);
        assert Arrays.equals(r1.getVector(),new int[]{0, 2, 6, 8}) : "Test adunare v1 si v2 esuat";
        Vector r2 = v1.adunare(v3);
        assert Arrays.equals(r2.getVector(),new int[]{4,6,3,4}) : "Test adunare v1 si v3 esuat";

        Vector v4 = new Vector(3);
        v4.setElem(4,5);
        assert Arrays.equals(v4.getVector(),new int[]{0,0,0}) : "Se adauga in vector pe o pozitie care nu exista";


    }

}
