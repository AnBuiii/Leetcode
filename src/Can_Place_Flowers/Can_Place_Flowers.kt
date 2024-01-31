package Can_Place_Flowers

class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var temp = n
        if (flowerbed.size == 1) return n == 0 || (n == 1 && flowerbed[0] == 0)
        for (i in flowerbed.indices) {
            if (flowerbed[i] == 0) {
                if (i == 0) {
                    if (flowerbed[1] == 0) {
                        temp--
                        flowerbed[0] = 1
                    }
                } else if (i == flowerbed.lastIndex) {
                    if (flowerbed[i - 1] == 0) {
                        temp--
                    }
                } else if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                    temp--
                    flowerbed[i] = 1
                }
                if (temp == 0) return true
            }

        }
        return false
    }
}