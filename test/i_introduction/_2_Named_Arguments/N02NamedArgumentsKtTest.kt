package i_introduction._2_Named_Arguments

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class N02NamedArgumentsKtTest {

    @Test
    fun testJoinToString() {
        assertThat(task2(listOf(1, 2, 3, 42, 555))).isEqualTo("{1, 2, 3, 42, 555}")
    }

    @Test
    fun testJoinToStringUsingLambda() {
        assertThat(task2f(listOf(1, 2, 3, 42, 555))).isEqualTo("{1, 2, 3, 42, 555}")
    }
}
