package com.example.kotlinbasics

data class AuthorDetails(val name: String,val age: Int, val booksPublished: Int)
fun main() {
    val authorOne = AuthorDetails("Thane", 21, 2)
    println("${authorOne.name} is a ${authorOne.age} year old author who has published ${authorOne.booksPublished} books")

    val myBook = Book()
    val customBook = Book("DoTA", "Thane", 2024)

    println("The title of the book is:${myBook.title} \n By:${myBook.author} \n Published on ${myBook.yearPublished}\n")
    println("The title of the book is:${customBook.title} \n By:${customBook.author} \n Published on ${customBook.yearPublished}")

}