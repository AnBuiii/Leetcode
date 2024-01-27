package Substring_with_Concatenation_of_All_Words

/**
 * Not
 */
class Solution {
    fun findSubstring(s: String, words: Array<String>): List<Int> {
        val wordLen = words[0].length
        val subStrLen = words.size * wordLen

        val result = mutableListOf<Int>()
        val wordCounts = words.groupingBy { it }.eachCount()

        // For efficiency slide over by wordLength at a time, so a full word can be removed and added
        // This needs to be repeated with the start offset by each index of wordLen
        for (i in 0 until wordLen) {
            val used = mutableMapOf<String, Int>()
            var start = i
            var end = i + subStrLen

            if (end > s.length) break

            // Fill used with the first words.size words
            s.substring(start, end).chunked(wordLen).forEach { word ->
                used[word] = used.getOrElse(word) { 0 } + 1
            }

            if (used == wordCounts) {
                result.add(start)
            }

            while (end <= s.length - wordLen) {
                // Remove old word
                val oldWord = s.substring(start, start + wordLen)

                if (used[oldWord]!! > 1) {
                    used[oldWord] = used[oldWord]!! - 1
                } else {
                    used.remove(oldWord)
                }

                // Add new word
                val newWord = s.substring(end, end + wordLen)

                used[newWord] = used.getOrElse(newWord) { 0 } + 1

                start += wordLen
                end += wordLen

                if (used == wordCounts) {
                    result.add(start)
                }
            }
        }

        return result
    }
}