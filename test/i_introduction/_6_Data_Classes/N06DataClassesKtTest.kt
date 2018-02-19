package i_introduction._6_Data_Classes

import org.assertj.core.api.Assertions.assertThat
import org.junit.Assert.assertEquals
import org.junit.Test


class N06DataClassesKtTest {
    @Test fun testListOfPeople() {
        assertThat(task6().toString()).isEqualTo("[Person(name=Alice, age=29), Person(name=Bob, age=31)]")
    }
}