package study.oopch3;

import org.junit.jupiter.api.Test;

class EnCapsulationTest {

    @Test
    void print_get_report() {
        EnCapsulation capsule = new EnCapsulation();


        System.out.println(capsule.getReport());
    }

}