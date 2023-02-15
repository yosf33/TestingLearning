
fun main() {
    println(sumTwoNumbers(3,5)==8)//true
    println(sumTwoNumbers(-3,-5)==-8)//true
    println(sumTwoNumbers(-3,5)==2)//true
    println(getAverageGrowth(18,192))
}

fun sumTwoNumbers(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber+ secondNumber
}

fun isEven(numberToCheck:Int)=numberToCheck%2==0

fun divide(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber/secondNumber
}

fun getAverageGrowth(year: Int, height: Int):Int? {
    return if (year in 1..18 && height in 30..210) {
        height/year
    } else {
        null
    }



}