package i_introduction._11_SAM_Conversions

import org.assertj.core.api.Assertions.assertThat
import org.junit.Assert.assertEquals
import org.junit.Test

class N11SAMConversionsKtTest {
    @Test fun testSort() {
        assertThat(task11()).isEqualTo(listOf(5, 2, 1))
    }
}
