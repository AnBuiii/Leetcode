package Divide_Array_Into_Arrays_With_Max_Difference

/**
 * 1. Check if nums.size can divide by 3
 * 2. Sort nums
 * 3. divide nums to group of 3,
 *  if the different between first and last element in the group bigger than k, return empty
 *  otherwise, add to result
 */
class Solution {
    fun divideArray(nums: IntArray, k: Int): Array<IntArray> {
        if (nums.size % 3 != 0) return emptyArray()
        nums.sort()
        val result = ArrayList<IntArray>()
        for (i in nums.indices step 3) {
            if (nums[i + 2] - nums[i] > k) return emptyArray()
            result.add(nums.sliceArray(i..i + 2))
        }
        return result.toTypedArray()
    }
}