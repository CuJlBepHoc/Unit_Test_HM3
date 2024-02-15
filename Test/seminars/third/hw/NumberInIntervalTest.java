package seminars.third.hw;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class NumberInIntervalTest {

    @Test
    public void testNumberInInterval() {
        NumberInInterval checker = new NumberInInterval();
        assertThat(checker.numberInInterval(26)).isTrue();
        assertThat(checker.numberInInterval(50)).isTrue();
        assertThat(checker.numberInInterval(99)).isTrue();
    }

    @Test
    public void testNumberBelowInterval() {
        NumberInInterval checker = new NumberInInterval();
        assertThat(checker.numberInInterval(20)).isFalse();
        assertThat(checker.numberInInterval(25)).isFalse();
    }

    @Test
    public void testNumberAboveInterval() {
        NumberInInterval checker = new NumberInInterval();
        assertThat(checker.numberInInterval(100)).isFalse();
        assertThat(checker.numberInInterval(150)).isFalse();
    }
}