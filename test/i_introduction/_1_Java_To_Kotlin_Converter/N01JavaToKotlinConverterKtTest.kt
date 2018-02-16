package i_introduction._1_Java_To_Kotlin_Converter

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class N01JavaToKotlinConverterKtTest {
    @Test fun collection() {
        assertThat(task1(listOf(1, 2, 3, 42, 555))).isEqualTo("{1, 2, 3, 42, 555}");
    }
}
