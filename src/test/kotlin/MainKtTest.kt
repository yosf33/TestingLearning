import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.function.Executable

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

    //3-throw exceptions
    @Test
    fun should_ThrowException_When_SecondNumberIsZero(){
        //given two number second number is zero
        val firstNumber=5
        val secondNumber=0
        //when divide by zero
        val divideResult:Executable=Executable{divide(firstNumber,secondNumber)}
        //then the exception should be thrown
        assertThrows(Exception::class.java,divideResult)
    }

    @Test
    fun should_ReturnCorrectAverage_when_HaveCorrectInput() {
        //given correct year and height
        val age=10
        val height=110
        //when calculate the average
        val average=getAverageGrowth(age,height)
        //then check the result
        assertEquals(11,average)
    }
@Test
    fun should_ReturnCorrectAverage_when_TheAverageCanBeRoundedToNextNumber() {
        //given correct year and height
        val age=18
        val height=192
        //when calculate the average
        val average=getAverageGrowth(age,height)
        //then check the result
        assertEquals(11,average)
    }


    @Test
    fun should_ReturnMinus1_when_AgeLargerThan18() {
        //given correct height and wrong age
        val age=25
        val height=175
        //when calculate the average
        val average=getAverageGrowth(age,height)
        //then check the result
        assertNull(average)
    }


    @Test
    fun should_ReturnMinus1_when_AgeIsZero() {
        //given  age is zero and correct height
        val age=0
        val height=110
        //when calculate the average
        val average=getAverageGrowth(age,height)
        //then check the result
        assertNull(average)
    }

    @Test
    fun should_ReturnMinus1_when_AgeIsNegative() {
        //given  age is negative and correct height
        val age=-18
        val height=110
        //when calculate the average
        val average=getAverageGrowth(age,height)
        //then check the result
        assertNull(average)
    }

    @Test
    fun should_ReturnMinus1_when_HeightSmallerThan30() {
        //given correct age and short height
        val age=16
        val height=25
        //when calculate the average
        val average=getAverageGrowth(age,height)
        //then check the result
        assertNull(average)
    }
    @Test
    fun should_ReturnMinus1_when_HeightLargerThan210() {
        //given correct age and tall height
        val age=16
        val height=250
        //when calculate the average
        val average=getAverageGrowth(age,height)
        //then check the result
        assertNull(average)
    }

    @Test
    fun should_ReturnMinus1_when_EnterWrongAgeAndHeight() {
        //given wrong age and short height
        val age=28
        val height=2
        //when calculate the average
        val average=getAverageGrowth(age,height)
        //then check the result
        assertNull(average)
    }


}