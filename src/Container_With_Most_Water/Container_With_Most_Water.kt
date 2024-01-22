package Container_With_Most_Water

/**
 * Two pointer
 * Check two pointer, if one is less than other, skip it
 */
class Solution {
    fun maxArea(height: IntArray): Int {
        var l= 0
        var r = height.size - 1
        var area = 0
        while (l < r){
            area = Math.max(area, Math.min(height[l] , height[r]) * (r - l))
            if(height[l] > height[r]){
                r--
            } else {
                l++
            }
        }
        return area
    }
}