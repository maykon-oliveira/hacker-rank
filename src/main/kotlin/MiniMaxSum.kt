/*
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun miniMaxSum(arr: Array<Int>): Unit {
    // Write your code here
    arr.sort()
    val maximum = arr.take(4).map { it.toLong() }.sum()
    val minimum = arr.slice(1 until arr.size).map { it.toLong() }.sum()

    println("$maximum $minimum")
}

fun main(args: Array<String>) {

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    miniMaxSum(arr)
}
