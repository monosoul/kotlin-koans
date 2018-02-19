package i_introduction._12_Extensions_On_Collections

import org.assertj.core.api.Assertions.assertThat
import org.junit.Assert.assertEquals
import org.junit.Test

class N12ExtensionsOnCollectionsKtTest {
    @Test fun testSort() {
        assertThat(task12()).isEqualTo(listOf(5, 2, 1))
    }
}
