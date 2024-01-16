package com.example.kotlinbasics

fun main(){

while (keepDrinking()){

    println("What is your name?")
    val name = readln()

    println("How many sugars do you want?")
    val sugarCount = readln().toInt()

    makeCoffee(sugarCount, name)
    }
}

fun makeCoffee(sugarCount: Int, name : String){

    if (sugarCount >1){
        println("$name, Your coffee has been made with $sugarCount sugars")
    }else{
        println("$name, Your coffee has been made with $sugarCount sugar")
    }
}

fun keepDrinking():Boolean{
    println("Do you want coffee?")
    var userChoice = true

    if(readln().lowercase() == "yes"){
        return userChoice
    }else{
        userChoice = false
        return userChoice
    }

}

