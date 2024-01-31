package Plus_One

/**
 * Modify array in-place to minimize memory size
 */
class Solution {
    fun plusOne(digits: IntArray): IntArray {
        var temp = 1
        for (i in digits.indices.reversed()) {
            if (digits[i] == 9) {
                digits[i] = 0
            } else {
                digits[i]++
                temp = 0
                break
            }
        }
        return if (temp == 0) digits else IntArray(digits.size + 1) { if (it == 0) 1 else digits[it - 1] }
    }
}