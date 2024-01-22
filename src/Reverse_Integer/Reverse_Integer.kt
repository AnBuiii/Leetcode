package Reverse_Integer

/**
 * convert to string then reverse
 * beware of boundary value
 */
class Solution {
    fun reverse(x: Int): Int {
        if(x == Int.MIN_VALUE) return 0
        var tempX = if(x > 0) x else  -x
        var revX = 0
        while (tempX != 0){
            if(revX > Int.MAX_VALUE/10 ) return 0

            revX = revX * 10 + tempX % 10
            tempX /= 10

        }
        return if(x > 0) revX else -revX
    }
}