fun main(args: Array<String>) {
    val likes: Int = 201
    if (likes % 10 == 1 && likes % 100 != 11) {
        println ("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
}