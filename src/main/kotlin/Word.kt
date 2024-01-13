package org.example

class Phrase(private val word: String?) {
    fun uniqueWordsCounter(): Int{
        val noUniqueWord = 0
        return word?.let {
            val arrayWords = it.split(" ").toSet()
            val numberUniqueWords = arrayWords.size
            numberUniqueWords
        }?:noUniqueWord
    }
}