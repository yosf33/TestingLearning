import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MainKtTest {

    @Test
    fun sumTwoNumbersFirstTest() {
        assertEquals(8,sumTwoNumbers(3,5))
    }

    @Test
    fun sumTwoNumbersSecondTest() {
        assertEquals(2,sumTwoNumbers(-3,5))
    }

    @Test
    fun sumTwoNumbersThirdTest() {
        assertEquals(-8,sumTwoNumbers(-3,-5))
    }
}