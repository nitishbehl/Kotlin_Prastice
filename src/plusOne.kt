fun plusOne(digits: IntArray): IntArray {
    for (i in digits.size - 1 downTo 0) {
        if (digits[i] < 9) {
            digits[i] = digits[i] + 1
            return digits
        }
        digits[i] = 0
    }
    val result = IntArray(digits.size + 1)
    result[0] = 1
    return result

}

fun main() {
    val num = intArrayOf(9, 9, 9)
    println(plusOne(num).joinToString()) //joinToString() is a Kotlin function that turns an array (or list)
// into a readable string with commas by default.

}