Primeiro, criei um objeto da classe Phrase com a frase “O Kotlin é uma linguagem de programação. Kotlin é divertido!”.
```Kotlin
val phrase = Phrase("O Kotlin é uma linguagem de programação. Kotlin é divertido!")
```
Depois, chamei o método `uniqueWordsCounter()` no objeto phrase. Esse método retorna o número de palavras únicas na frase.

```Kotlin
val resultOfSingleWords = phrase.uniqueWordsCounter()
```
Em seguida, imprimi o número de palavras únicas na frase.
```Kotlin
println("Number of unique words: $resultOfSingleWords")
```
Agora, vamos para a definição da classe Phrase:
```Kotlin
class Phrase(private val word: String?) {
    fun uniqueWordsCounter(): Int {
        val noUniqueWord = 0
        return word?.let {
            val arrayWords = it.split(" ").toSet()
            val numberUniqueWords = arrayWords.size
            numberUniqueWords
        } ?: noUniqueWord
    }
}
```
A classe `Phrase` tem uma propriedade privada chamada `word`, que é a frase que queremos analisar. O método `uniqueWordsCounter()` calcula o número de palavras únicas na frase.
Primeiro, inicializo uma variável `noUniqueWord` com 0. Essa variável representa o número de palavras únicas na frase.
Depois, uso a função `let` para trabalhar com a propriedade `word`. Se `word` não for nulo, divido a frase em palavras usando o método `split(" ")` e converto a lista de palavras em um conjunto usando o método `toSet()`. Isso remove quaisquer palavras duplicadas.
Em seguida, obtenho o número de palavras únicas na frase pegando o tamanho do conjunto de palavras.
Finalmente, retorno o número de palavras únicas na frase. Se a propriedade `word` for nula, então o método `uniqueWordsCounter()` retorna `noUniqueWord`, que é 0. Isso significa que se a frase for nula, então o número de palavras únicas é 0.
