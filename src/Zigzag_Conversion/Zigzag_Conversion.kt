package Zigzag_Conversion

/**
 * calculate the interval (step) of inner loop
 */
class Solution {
    fun convert(s: String, numRows: Int): String {
        val step = numRows * 2 - 2
        if(step == 0) return s
        val result = StringBuilder()
        for (i in 0..<numRows) {
            for (j in 0..(s.length - i) / (step)) {
                if(j * step + i < s.length) {
                    result.append(s[j * step + i])
                    if (i != 0 && i != numRows - 1) {
                        val hm = j * step + i + (step - i * 2)
                        if(hm < s.length){
                            result.append(s[hm])
                        }
                    }
                } else break

            }
        }
        return result.toString()
    }
}