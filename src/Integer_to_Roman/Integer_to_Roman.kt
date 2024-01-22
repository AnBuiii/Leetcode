package Integer_to_Roman

import kotlin.math.pow

/**
 * use map to reduce finding time
 */
class Solution {
    fun intToRoman(num: Int): String {
        var result = ""
        val map = mapOf(
            1 to "I",
            2 to "II",
            3 to "III",
            4 to "IV",
            5 to "V",
            6 to "VI",
            7 to "VII",
            8 to "VIII",
            9 to "IX",
            10 to "X",
            20 to "XX",
            30 to "XXX",
            40 to "XL",
            50 to "L",
            60 to "LX",
            70 to "LXX",
            80 to "LXXX",
            90 to "XC",
            100 to "C",
            200 to "CC",
            300 to "CCC",
            400 to "CD",
            500 to "D",
            600 to "DC",
            700 to "DCC",
            800 to "DCCC",
            900 to "CM",
            1000 to "M",
            2000 to "MM",
            3000 to "MMM"
        )
        var hm = num
        var i = 0
        while (hm > 0) {
            val temp = hm % 10
            val haiz = map[temp * 10f.pow(i).toInt()]
            if (haiz != null) {
                result = haiz + result
            }
            hm /= 10
            i++
        }
        return result
    }
}