import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MainKtTest {
    //1-intro to testing
    fun should_ReturnCorrectSummation_When_BothNumbersPositive() {
        //given  two positive numbeers
        val firstNumber=3
        val secondNumber=5
        //when find the summation of two numbers
        val sumResult=sumTwoNumbers(3,5)
        //then
        assertEquals(8,sumResult)
    }

    //2-naming functions:
    @Test
    fun should_ReturnTrue_When_TheNumberIsEven() {
        //given even number
        val numberToCheck=10
        //when find number is even
        val result = isEven(numberToCheck)
        //then
        assertEquals(true,result)
    }

    @Test
    fun should_ReturnFalse_When_TheNumberIsOdd() {
        //given odd number
        val numberToCheck=9
        //when check if number is odd
        val result=(isEven(numberToCheck))
        //then
        assertFalse(result)
    }

    @Test
    fun isEven_theNumberIsEven_returnTrue() {
        //given number
        val numberToCheck=4
        //when number is even
        val result=isEven(numberToCheck)
        //then
        assertTrue(result)
    }

    @Test
    fun isEven_theNumberIsOdd_returnFalse() {
        //given number
        val numberToCheck=3
        //when number is odd
        val result=isEven(numberToCheck)
        //then
        assertFalse(result)
    }


}