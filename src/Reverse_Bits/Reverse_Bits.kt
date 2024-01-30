package Reverse_Bits

/**
 *
 */
class Solution {
    // you need treat n as an unsigned value
    fun reverseBits(n:Int):Int {
        var num = n
        var result = 0
        var bits = 32

        while (bits > 0) {
            result = result shl 1
            result = result or (num and 1)
            num = num shr 1
            bits--
        }
        return result
    }
}