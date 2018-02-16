package i_introduction._5_String_Templates

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class N05StringTemplatesKtTest {
    @Test fun match() {
        assertThat("11 MAR 1952").matches(task5());
    }

    @Test fun match1() {
        assertThat("24 AUG 1957").matches(task5())
    }

    @Test fun doNotMatch() {
        assertThat("24 RRR 1957").doesNotMatch(task5())
    }
}
