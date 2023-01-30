fun main(){
     println("Введите число")
    val num = readLine().toString()
    val number = chislo(num)
    println(number)
}
fun chislo(num: String): List<Int> {
    val numStr = num.toString()
    val number = mutableListOf<Int>()
    if (numStr.length == 3) {
        for (char in numStr) {
            val digit = char.toString().toInt()
            if (digit % 2 == 0) {
                number.add(digit)
            }
        }
    }
    return number
}