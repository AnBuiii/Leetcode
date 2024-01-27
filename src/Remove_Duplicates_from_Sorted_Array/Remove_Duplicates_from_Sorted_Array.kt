package Remove_Duplicates_from_Sorted_Array

/**
 * BAD solution using distinct()
 */
class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        nums.distinct().let {
            it.forEachIndexed { index, value ->
                nums[index] = value
            }
            return it.size
        }
    }
}