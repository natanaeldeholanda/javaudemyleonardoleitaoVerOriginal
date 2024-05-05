package classe;

import org.w3c.dom.ls.LSOutput;

public class VariaveisLocais {
    int a = 2;
    int a1 = 3;

    void teste1() {
        int a1 = 2;
        System.out.println(a);
        if (a1 > 3) {
            int a2 = a1;
        }
        //System.out.println(a2);
    }

    void test2() {
        int a2 = 2;
        System.out.println(a2);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
