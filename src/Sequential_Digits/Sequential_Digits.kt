package Sequential_Digits



/**
 * There are some variable we need to find
 * - first sequential digit with length n: 123...n
 * - step of each sequential with length n: 1111...1 (n digit 1)
 *
 * Example: low = 1300, high = 13000
 * - result may have length 4 or 5
 *
 * - length = 4
 *     * step = 1111
 *     * First sequential digit is 1234
 *     * 1234 is less than low -> skip
 *     * the next is 2345, 3456, ..., 6789 -> accept
 * - length = 5
 *     * step = 11111
 *     * First sequential is 12345 -> accept
 *     * 23456 is more than 13000 -> stop
 */
class Solution {
    fun sequentialDigits(low: Int, high: Int): List<Int> {
        val result = mutableListOf<Int>()
        for (i in low.length()..high.length()) {
            var sequential = firstSequential(i)
            val step = step(i)
            while (sequential % 10 != 0) {
                if (sequential in low..high) {
                    result.add(sequential)
                    sequential += step
                }
                if (sequential < low) {
                    sequential += step
                }
                if (sequential > high) {
                    break
                }
            }
        }
        return result
    }

    private fun Int.length(): Int {
        var temp = this
        var result = 0
        while (temp > 0) {
            temp /= 10
            result++
        }
        return result
    }


    // E.g: firstSequential(3) = 123
    private fun firstSequential(length: Int): Int {
        var result = 0
        for (i in 1..length) {
            result += 10.pow(length - i) * i
        }
        return result
    }

    // E.g: step(3) = 111
    private fun step(length: Int): Int {
        var result = 0
        for (i in 1..length) {
            result += 10.pow(length - i)
        }
        return result
    }

    private fun Int.pow(n: Int): Int {
        var result = 1
        repeat(n) { result *= this }
        return result
    }
}