package i_introduction._10_Object_Expressions

import org.assertj.core.api.Assertions.assertThat
import org.junit.Assert.assertEquals
import org.junit.Test

class N10ObjectExpressionsKtTest {
    @Test fun testSort() {
        assertThat(task10()).isEqualTo(listOf(5, 2, 1))
    }
}
