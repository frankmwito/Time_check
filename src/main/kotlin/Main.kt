import java.util.Date
import java.text.SimpleDateFormat

fun main() {
    val currentDate = Date()
    val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val formattedDate = dateFormat.format(currentDate)
    println("Current Date and Time: $formattedDate")
}