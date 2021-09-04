package study.oopch2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BirthDayTest {

    @Test
    void birth_Class_Test_true () {
        BirthDay date = new BirthDay();
        date.setYear(2021);
        date.setDay(30);
        date.setMonth(14);

        assertFalse(date.isValid());
    }

    @Test
    void birth_Class_Test () {
        BirthDay date = new BirthDay();
        date.setYear(2021);
        date.setDay(30);
        date.setMonth(12);

        assertTrue(date.isValid());
    }
}