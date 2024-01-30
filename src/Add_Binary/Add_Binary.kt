package Add_Binary

import java.math.BigInteger

/**
 * bitwise solution
 */
class Solution {
    fun addBinary(a: String, b: String): String {
        var aInt = a.toBigInteger(2)
        var bInt = b.toBigInteger(2)

        while (bInt != BigInteger.ZERO) {
            val sum = aInt xor bInt
            val carry = (aInt and bInt) shl 1
            aInt = sum
            bInt = carry
        }

        return aInt.toString(2)
    }
}