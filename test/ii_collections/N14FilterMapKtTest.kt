package ii_collections

import ii_collections.data.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.Assert.assertEquals
import org.junit.Test

class N14FilterMapKtTest {
    @Test fun testCitiesCustomersAreFrom() {
        assertThat(shop.getCitiesCustomersAreFrom()).isEqualTo(setOf(Canberra, Vancouver, Budapest, Ankara, Tokyo))
    }

    /**
     * Returns the list of the customers who live in the city 'city'
     */
    @Test fun testCustomersFromCity() {
        assertThat(shop.getCustomersFrom(Canberra)).isEqualTo(listOf(customers[lucas], customers[cooper]))
    }
}
