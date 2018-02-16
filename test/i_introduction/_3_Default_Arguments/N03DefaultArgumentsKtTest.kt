package i_introduction._3_Default_Arguments

import org.assertj.core.api.Assertions.assertThat
import org.junit.Assert.assertEquals
import org.junit.Test

class N03DefaultArgumentsKtTest {

    @Test fun testDefaultAndNamedParams() {
        assertThat(task3()).isEqualTo("a42b1C42D2")
    }
}