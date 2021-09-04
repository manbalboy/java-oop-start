package study.oopch1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {

    @Test
    void test() {
        Student studentLee = new Student(100, "Lee");
        studentLee.setMathSubject("수학", 90);
        studentLee.setKoreaSubject("국어", 100);
        assertAll(
                () -> assertEquals(190, studentLee.getTotalScore()),
                () -> assertEquals("Lee",studentLee.studentName ),
                () -> assertEquals("수학",studentLee.math.subjectName )
        );

    }
}