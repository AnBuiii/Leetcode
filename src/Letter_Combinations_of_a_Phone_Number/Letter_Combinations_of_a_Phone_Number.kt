package Letter_Combinations_of_a_Phone_Number

/**
 * Use map to find more efficiently
 */
class Solution {
    fun letterCombinations(digits: String): List<String> {
        if (digits.isBlank()) {
            return emptyList()
        }
        val maps = hashMapOf(
            Pair('2', "abc"),
            Pair('3', "def"),
            Pair('4', "ghi"),
            Pair('5', "jkl"),
            Pair('6', "mno"),
            Pair('7', "pqrs"),
            Pair('8', "tuv"),
            Pair('9', "wxyz")
        )

        var result = listOf("")

        digits.forEach { d ->
            val newResult = mutableListOf<String>()

            maps[d]?.forEach { a ->
                result.forEach { r ->
                    newResult.add(r + a)
                }
            }
            result = newResult
        }
        return result
    }
}