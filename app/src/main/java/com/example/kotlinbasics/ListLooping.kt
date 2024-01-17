package com.example.kotlinbasics

val numbers = mutableListOf(1,2,3,4,5)

fun main(){
    for (index in 0 until numbers.size){
        println(numbers[index]*2)
    }


}