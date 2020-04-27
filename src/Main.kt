// https://www.hackerrank.com/challenges/s10-quartiles/problem

fun quartile(numbers: List<Int>): Int {
    val length = numbers.size

    return if (length % 2 == 1) {
        numbers[length / 2]
    } else {
        (numbers[length / 2] + numbers[length / 2 - 1]) / 2
    }
}

fun main() {
    val numOfNumbers = readLine()!!.toInt()
    val numbers = readLine()!!.split(" ").map { it.toInt() }.sorted()

    val q1 = quartile(numbers.subList(0, numOfNumbers / 2))
    val q2 = quartile(numbers)
    val q3 = if (numOfNumbers % 2 == 1) quartile(
        numbers.subList(
            numOfNumbers / 2 + 1,
            numOfNumbers
        )
    ) else quartile(numbers.subList(numOfNumbers / 2, numOfNumbers))

    println(q1)
    println(q2)
    println(q3)
}