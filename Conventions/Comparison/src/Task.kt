data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        return compareValuesBy(this, other, MyDate::year, MyDate::month, MyDate::dayOfMonth)
    }
}

fun test(date1: MyDate, date2: MyDate) {
    println(date1 < date2)
}

fun main() {
    val date1 = MyDate(2026, 3, 15)
    val date2 = MyDate(2026, 6, 13)
    test(date1, date2) // Output: true
}