package Two_Sum

/**
 * Use [HashMap] to save visited value
 */


class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hashMap = hashMapOf<Int, Int>()

        for (i in nums.indices) {
            val diff = target - nums[i]
            val index = hashMap[diff]

            if (index != null) {
                return intArrayOf(index, i)
            }

            hashMap[nums[i]] = i
        }

        return intArrayOf()
    }
}