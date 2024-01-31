package Daily_Temperatures

/**
 * 1. Create array has size = 100 - 30 + 1 for temporary value
 * 2. Create array for result
 * 3. Loop temperatures reversely (we will replace exist temporary day by current day, so we can assure that
 *  all current temporary value always bigger than current day
 * 4. dp(current temperature) = i
 * 5. find the min value that bigger than i from dp(current temperature) to dp(last index)
 * 6. result(i) = value - i
 * 7. return result
 */
class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val dp = IntArray(71) { 0 }
        val result = IntArray(temperatures.size)

        for (i in temperatures.lastIndex downTo 0) {
            val todayTemperature = temperatures[i] - 30
            dp[todayTemperature] = i
            var min = temperatures.size
            for (j in todayTemperature + 1..dp.lastIndex) {
                if (dp[j] > i) {
                    min = minOf(min, dp[j])
                }
            }
            result[i] = if (min == temperatures.size) 0 else min - i
        }

        return result
    }
}