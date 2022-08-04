/*
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun plusMinus(arr: Array<Int>): Unit {
    // Write your code here
    val positive = arr.count { it > 0 }.toDouble() / arr.size;
    val negative = arr.count { it < 0 }.toDouble() / arr.size;
    val zero = arr.count { it == 0 }.toDouble() / arr.size;

    println("%.6f".format(positive))
    println("%.6f".format(negative))
    println("%.6f".format(zero))
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}
