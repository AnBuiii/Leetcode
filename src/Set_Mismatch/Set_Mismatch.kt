package Set_Mismatch

/**
 * Use frequency array
 */

class Solution {
    fun findErrorNums(nums: IntArray): IntArray {
        val result = IntArray(2) { 0 }
        val freq = IntArray(nums.size) { 0 }
        nums.forEach { freq[it - 1]++ }
        for (i in freq.indices) {
            if (freq[i] == 2) {
                result[0] = i + 1
                if (result[1] != 0) {
                    return result
                }
            }
            if (freq[i] == 0) {
                result[1] = i + 1
                if (result[0] != 0) {
                    return result
                }
            }
        }
        return result
    }
}