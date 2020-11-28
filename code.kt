data class Student(
        val name: String,
        val age: Int,
        val primarySkill: String
) {
    override fun toString(): String {
        return "$name ($age y.o.) primary skill - $primarySkill"
    }
}

fun main() {
    val students = listOf(
            Student("Sasha", 22, "Java"),
            Student("Vasya", 30, "Android"),
            Student("Katya", 24, "Kotlin")
    )
    students.forEach { println(it) }

}
