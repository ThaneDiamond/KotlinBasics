package com.example.kotlinbasics

fun main(){
    var fruitsList = mutableListOf("Apple","Pineapple","Fig","Berrie","Olive")
    println(fruitsList)

    fruitsList.add("Strawberry")
    println(fruitsList)

    fruitsList.remove("Strawberry")
    println(fruitsList)

    if (fruitsList.contains("Olive")){
        println("This list contains OLIVES!!")
    }else{
        println("No olives in this list...")
    }
}