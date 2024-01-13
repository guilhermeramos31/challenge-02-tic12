package org.example

fun main() {
    val phrase = Phrase("O Kotlin é uma linguagem de programação. Kotlin é divertido!")
    val resultOfSingleWords = phrase.uniqueWordsCounter()
    println("Number of unique words: $resultOfSingleWords")
}