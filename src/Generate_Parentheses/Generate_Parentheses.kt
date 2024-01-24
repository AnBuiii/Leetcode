package Generate_Parentheses

/**
 * Backtracking solution, think about
 * when we HAVE TO open,
 * when we HAVE TO close,
 * when we CAN do both
 * and when we STOP
 */
class Solution {
    private val result: MutableList<String> = ArrayList()
    fun generateParenthesis(n: Int): List<String> {
        generate(n, n)
        return result
    }

    private fun generate(l: Int, r: Int, temp: String = "") {
        when {
            l == 0 && r == 0 -> result.add(temp)
            l == r -> generate(l - 1, r, "$temp(")
            l == 0 -> generate(l, r - 1, "$temp)")
            else -> {
                generate(l - 1, r, "$temp(")
                generate(l, r - 1, "$temp)")
            }
        }
    }
}