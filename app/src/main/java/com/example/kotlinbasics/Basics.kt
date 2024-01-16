package com.example.kotlinbasics


fun main(){
    //val shoppingList = listOf("CPU","GPU", "Mobo" )

    val shoppingList = mutableListOf<String>("CPU","GPU", "Mobo" )

    shoppingList.add("SSD")
    shoppingList.remove("SSD")
    shoppingList.add("NVME")


}

/*var Daisy =Dog("Daisy", "Wors", 3)

println(Daisy)
println("Daisy is a ${Daisy.breed} and is ${Daisy.age} years old ")*/

   /* val myChar = '#'
    val myText = "###"
    var myName = "Thane"


    println("I'm a Char $myChar")
    println("And I'm a String $myText")
    println("this is my name \n \t ${myName.uppercase()}")

    println("Can you guess a word with 6 letters")

    // we can also ask for an age and parse the given value using .toInt
    val guessLength = readln().length
    if (guessLength == 6){
        println("Correct")

    }
    else{
        println("not quite right")
    }

*/


/*
    val myTrue: Boolean = true;
    val myFalse: Boolean = false;

    println(myFalse || myTrue ) //True
    println(myTrue && myFalse) //False
    println(!myTrue) //False
*/

/*    val Number1 = 1
    var String1 = "to"
    println("Hello World! $Number1 $String1")
    String1 = "too"
    println("to changed to $String1")*/
