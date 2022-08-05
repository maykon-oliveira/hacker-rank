import java.time.LocalTime
import java.time.format.DateTimeFormatter

/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion(s: String): String {
    // Write your code here
    val localDate = LocalTime.parse(s, DateTimeFormatter.ofPattern("hh:mm:ssa"))
    return DateTimeFormatter.ofPattern("HH:mm:ss").format(localDate)
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}
