package fundamentos.classe


class People2(
    val name: String,
    val age: Int
) {
//    override fun toString(): String {
//        return "Name: $name\n" +
//                "Age: $age years"
}


fun main() {
    val peopleOne = People2("Kevin Richard", 20)
    println("Name: ${peopleOne.name} and Age: ${peopleOne.age}")


}
