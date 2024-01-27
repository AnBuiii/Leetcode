package Next_Permutation

/**
 * Focus in the meaning of lexicographically order
 * and you will find the answer
 *
 * nums = 147632,
 * find the suitable place: 14|7632 (after-part is descending), the element where not descending anymore is place to start
 * swap with minBigger of 4 is 6 -> 16|7432 (this will keep after-part descending)
 * reverse the after-part: 16|2347 -> 162347
 */
class Solution {
    fun nextPermutation(nums: IntArray) {
        tailrec fun find(x: Int, l: Int, r: Int): Int {
            // the segment need to find is descending
            if (l == r) return l
            val m = (l + r) / 2
            if (nums[m] == nums[x]) return m
            return if (nums[m] > nums[x]) find(x, m +1, r)
            else find(x, l, m)
        }

        fun findMinBigger(x: Int, l: Int, r: Int): Int {
            var index = find(x, l, r)
            while(nums[x] >= nums[index]){
                index --
            }

            return index
        }

        fun reverse(l: Int, r: Int) {
            val m = (l + r) / 2
            for (i in l..m) {
                nums[i] = nums[l + r - i].also { nums[l + r - i] = nums[i] }
            }
        }

        var i = nums.size - 1

        while (i != 0) {
            if (nums[i] > nums[i - 1]) {
                val minBigger = findMinBigger(i - 1, i, nums.size - 1)
                nums[i - 1] = nums[minBigger].also { nums[minBigger] = nums[i - 1] }
                reverse(i, nums.size - 1)
                return
            }
            i--
        }
        reverse(0, nums.size - 1)
    }
}