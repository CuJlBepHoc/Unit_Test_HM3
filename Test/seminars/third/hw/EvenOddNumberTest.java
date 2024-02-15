package seminars.third.hw;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class EvenOddNumberTest {

    @Test
    public void testEvenNumber() {
        EvenOddNumber checker = new EvenOddNumber();
        assertThat(checker.evenOddNumber(2)).isTrue();
        assertThat(checker.evenOddNumber(10)).isTrue();
        assertThat(checker.evenOddNumber(100)).isTrue();
        assertThat(checker.evenOddNumber(2342)).isTrue();
    }

    @Test
    public void testOddNumber() {
        EvenOddNumber checker = new EvenOddNumber();
        assertThat(checker.evenOddNumber(1)).isFalse();
        assertThat(checker.evenOddNumber(7)).isFalse();
        assertThat(checker.evenOddNumber(99)).isFalse();
        assertThat(checker.evenOddNumber(3333)).isFalse();
    }
}