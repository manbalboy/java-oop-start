package study.oopch4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThisStudyTest {

    @Test
    void test_this_constructor() {
        ThisStudy thisStudy = new ThisStudy();

        assertAll(
                () -> assertEquals(12, thisStudy.age),
                () -> assertEquals("Lee", thisStudy.name)
        );
    }

}