
fun main() {
    println(sumTwoNumbers(3,5)==8)//true
    println(sumTwoNumbers(-3,-5)==-8)//true
    println(sumTwoNumbers(-3,5)==2)//true
}

fun sumTwoNumbers(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber+ secondNumber
}

fun isEven(numberToCheck:Int)=numberToCheck%2==0