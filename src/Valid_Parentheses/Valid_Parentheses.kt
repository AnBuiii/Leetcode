package Valid_Parentheses

import java.util.*

/**
 * Use stack
 * If meet open -> add stack
 * if meet close -> pop have to match
 */
class Solution {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        for (c in s) {
            if (c == '{' || c == '[' || c == '(') {
                stack.add(c)
            } else {
                if (stack.isEmpty()) return false
                when (c) {
                    '}' -> {
                        if (stack.pop() != '{') {
                            return false
                        }
                    }

                    ']' -> {
                        if (stack.pop() != '[') {
                            return false
                        }
                    }

                    ')' -> {
                        if (stack.pop() != '(') {
                            return false
                        }
                    }
                }
            }
        }
        return stack.isEmpty()
    }
}