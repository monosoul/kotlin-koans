package i_introduction._0_Hello_World

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class N00StartKtTest {
    @Test fun testOk() {
        assertThat(task0()).isEqualTo("OK")
    }
}