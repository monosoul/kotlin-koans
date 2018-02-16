package i_introduction._4_Lambdas

import org.assertj.core.api.Assertions.assertThat
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class N04LambdasKtTest {
    @Test fun contains() {
        assertThat(task4(listOf(1, 2, 3))).isTrue();
    }

    @Test fun notContains() {
        assertThat(task4(listOf(1, 3, 5))).isFalse();
    }
}