package ii_collections

import ii_collections.data.customers
import ii_collections.data.shop
import org.assertj.core.api.Assertions.assertThat
import org.junit.Assert.assertEquals
import org.junit.Test

class N13IntroductionKtTest {
    @Test fun testSetOfCustomers() {
        assertThat(shop.getSetOfCustomers()).isEqualTo(customers.values.toSet())
    }
}
