package Remove_Element

/**
 * BAD solution using filterNot
 */
class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        nums.filterNot { it == `val` }.let {
            it.forEachIndexed{ idx, num ->
                nums[idx] = num
            }
            return it.size
        }
    }
}