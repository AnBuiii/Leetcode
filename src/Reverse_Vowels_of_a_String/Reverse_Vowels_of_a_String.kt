package Reverse_Vowels_of_a_String

import java.util.*

/**
 * 1. loop and add all vowel to stack
 * 2. loop again and build string with [StringBuilder]
 *
 *
 */
class Solution {
    fun reverseVowels(s: String): String {
        val stack = Stack<Char>()
        s.forEach {
            if (it.isVowels()) stack.push(it)
        }
        val result = StringBuilder()
        s.forEach {
            if (it.isVowels()) {
                result.append(stack.pop())
            } else {
                result.append(it)
            }
        }
        return result.toString()
    }

    private fun Char.isVowels(): Boolean {
        return this == 'a' || this == 'i' || this == 'e' || this == 'o' || this == 'u' ||
                this == 'A' || this == 'I' || this == 'E' || this == 'O' || this == 'U'
    }
}