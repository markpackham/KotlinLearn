// open class makes the class Public, they are Private by default
// abstract works the same in Java
abstract class Animal (
    val name: String,
    val legCount: Int = 4
) {
    init{
        println("Hello, my name is $name")
    }

    abstract fun makeSound()
}