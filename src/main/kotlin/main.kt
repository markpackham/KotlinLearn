// Learn Kotlin from https://www.youtube.com/watch?v=5flXf8nuq60
// It's like Java for lazy people often used to make Android apps
fun main(){
    // you can use "val" or "var" for variables, val is like "const" in JavaScript and var like "let"
    // var x: Int = 3
    // Kotlin is smart enough to identify some types like ints and longs
    var mrLong = 3L
    println("The value of x is $mrLong")
    mrLong = 4
    println("The value of x is now $mrLong")


    // Variables
//    val wholeNumber = 3
//    val bigNumber = 3L
//    val preciseDecimal = 3.33
//    val decimalForMemoryCheapPeople = 3.33f
//    val iLoveFootball = false
//    val iLoveHockey = true
//    val iAmALetter = 'a'

    val x = 3f / 4f
    val y = 10 % 2
    val amIAnAdult = true
    val amIAProgrammer = true
    val amIAnAdultProgrammer = amIAnAdult && amIAProgrammer
    val amIReallyAnAdultProgrammer = amIAnAdult || amIAProgrammer
    val amIReallyReallyAnAdultProgrammer = amIAnAdult == amIAProgrammer
    val amIReallyReallyReallyAnAdultProgrammer = !(amIAnAdult != amIAProgrammer)
    println("The value of x is $x")
    println("The value of y is $y")
    println(amIAnAdultProgrammer)
    println(amIReallyAnAdultProgrammer)
    println(amIReallyReallyAnAdultProgrammer)
    println(amIReallyReallyReallyAnAdultProgrammer)
}