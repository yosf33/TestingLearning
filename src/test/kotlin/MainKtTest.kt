import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MainKtTest {
//1-intro to testing
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
//2-naming functions:
    @Test
    fun should_ReturnTrue_When_TheNumberIsEven(){
        assertEquals(true,isEven(10))
    }

    @Test
    fun should_ReturnFalse_When_TheNumberIsOdd(){
        assertFalse(isEven(9))
    }

    @Test
    fun isEven_theNumberIsEven_returnTrue(){
        assertTrue(isEven(4))
    }

    @Test
    fun isEven_theNumberIsOdd_returnFalse(){
        assertFalse(isEven(9))
    }
}