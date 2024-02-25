package Sort_Characters_By_Frequency

/**
 * Simple solution using kotlin's collection
 */
class Solution {
    fun frequencySort(s: String): String {
        val result = StringBuilder()
        s.groupingBy { it }
            .eachCount()
            .toList()
            .sortedByDescending { it.second }
            .forEach { (c, i) ->
                repeat(i) {
                    result.append(c)
                }
            }
        return result.toString()
    }
}