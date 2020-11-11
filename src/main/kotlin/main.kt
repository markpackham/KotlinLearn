import java.lang.Exception

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

    val string = "Kotlin is the best language after PHP"
    println(string.toUpperCase())

    val i = 1 + 1
    if(i == 2){
        println("i is 2")
    }else if(i == 3){
        println("i is 3")
    }else{
        println("Why are you wasting my time?")
    }

    val j = if(i == 2) 2 else 3


    // we can set a default is null is entered by mistake using "?:"
//    val number1 = readLine() ?: "0"
//    val number2 = readLine() ?: "0"
//    // the !! makes us assume we aren't going to have nulls
//    val result = number1!!.toInt() + number2!!.toInt()
//    println(result)

    val shoppingList = listOf("Car","Cannon","Castle")

    val shoppingList2 = mutableListOf("Car2","Cannon2","Castle2")
    shoppingList2.add("Coconut2")
    println(shoppingList2[3])

    var counter = 0
    while (counter < shoppingList.size){
        println(shoppingList[counter])
        counter ++
    }

    for (shoppingItem in shoppingList){
        println(shoppingItem)
    }

    val whenVal = 3
    when(whenVal){
        in 1..2 -> println("x is between 1 and 2")
        in 3..7 -> println("x is between 3 and 7")
        else ->{
            println("You won't find what you're looking for here")
        }
    }

    print10Numbers()

    println(isEven())

    val evenCheck = isEven(10)
    val oddCheck = 3
    // you could also do this if you like to be specific "isEven(number = 10)"
    println(evenCheck)
    println(oddCheck.isOdd())

//    val dog = Animal("Fido")
    val dog2 = Dog()
    dog2.makeSound()

    val cat = Cat()
    cat.makeSound()

    // working with an anonymous Class
    val bear = object : Animal("Yogi"){
        override fun makeSound() {
            println("Roar!")
        }
    }
    bear.makeSound()


//    println("Please enter a number")
//    val numby = readLine() ?: "0"
//    val parsedNumber = try {
//        numby.toInt()
//    }catch (e: Exception){
//        // if user enters something that be converted to an Int provide 0
//        0
//    }
//    println(parsedNumber)

val list = listOf("Kotlin", "is", "fun")
    // lambda functions use { } rather than ( )
    /*
    Lambda expressions and anonymous functions are 'function literals', i.e.
    functions that are not declared, but passed immediately as an expression
    https://kotlinlang.org/docs/reference/lambdas.html
     */
val count = list.count { currentString ->
    // count how many string have 3 characters, answer "1" for "fun"
    currentString.length == 3
}
    println(count)


// we are calling a function we created called "customCount"
// it is a generic function that can handle lists of any type
    val count2 = list.customCount { currentString ->
        // count how many string have 3 characters, answer "2"
        currentString.length >= 3
    }
    println(count2)

}



// FUNCTIONS

// you must specify the type for parameters in a function
// you can also set a default parameter
fun isEven(number: Int = 5): Boolean {
    return number % 2 == 0
}

// alternate way to write a function
fun Int.isOdd(): Boolean{
    return this % 2 != 0
}

fun print10Numbers(){
    for(i in 1..10){
        println(i)
    }
}


// T stands for Type since we are using Generics
fun <T> List<T>.customCount(function: (T) -> Boolean): Int{
    var counter = 0
    for (stringy in this){
        if(function(stringy)){
            counter++
        }
    }
    return counter
}