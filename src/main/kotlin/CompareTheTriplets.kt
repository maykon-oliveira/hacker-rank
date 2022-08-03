/*
 * Complete the 'compareTriplets' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    // Write your code here
    return a.zip(b)
        .fold(arrayOf(0, 0)) { score, pair ->
            if (pair.first > pair.second) score[0] = score[0] + 1
            else if (pair.second > pair.first) score[1] = score[1] + 1
            score
        }
}

fun main(args: Array<String>) {

    val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}
