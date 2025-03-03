package Length_of_Longest_Fibonacci_Subsequence

// 2 14 18 32 50
class Solution {

    fun lenLongestFibSubseq(arr: IntArray): Int {
        var max = 0
        val set = HashSet<Int>(arr.size)
        arr.forEach {
            set.add(it)
        }

        fun rec(i: Int, j: Int): Int {
            return if (set.contains(i + j)) {
                rec(j, i + j) + 1
            } else {
                0
            }


        }

        for (i in 0..arr.size - 3) {
            for (j in i + 1..arr.size - 2) {
                val cur = rec(arr[i], arr[j])
                if (cur != 0) {
                    max = maxOf(max, cur + 2)
                }
            }
        }
        return max
    }
}