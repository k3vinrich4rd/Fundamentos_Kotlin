package fundamentos.scopingfunction

class SemLet(
    private var id: Int,
    private var name: String,
    private var age: Int
) {
    override fun toString(): String {
        return "Id user: $id\n " +
                "Name user: $name\n " +
                "Age user: $age"
    }
}

fun main(){
    val semLet = SemLet(1, "Kevin Richard", 20)
    println(semLet.toString())
}