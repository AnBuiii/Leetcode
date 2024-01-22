package Roman_to_Integer

/**
 * Just check condition form M -> I
 * This may not clean, prefer using HashMap
 */
class Solution {
    fun romanToInt(s: String): Int {
        var result = 0

        var i = 0

        loop@ while (i < s.length) {
            when (s[i]) {
                'M' -> result += 1000
                'D' -> result += 500
                'C' -> {
                    if (i != s.length - 1) {
                        if (s[i + 1] == 'D') {
                            result += 400
                            i += 2
                            continue@loop
                        }
                        if (s[i + 1] == 'M') {
                            result += 900
                            i += 2
                            continue@loop

                        }

                    }
                    result += 100
                }

                'L' -> result += 50
                'X' -> {
                    if (i != s.length - 1) {
                        if (s[i + 1] == 'L') {
                            result += 40
                            i += 2
                            continue@loop

                        }
                        if (s[i + 1] == 'C') {
                            result += 90
                            i += 2
                            continue@loop

                        }

                    }
                    result += 10
                }

                'V' -> result += 5
                'I' -> {
                    if (i != s.length - 1) {
                        if (s[i + 1] == 'V') {
                            result += 4
                            i += 2
                            continue@loop
                        }
                        if (s[i + 1] == 'X') {
                            result += 9
                            i += 2
                            continue@loop
                        }

                    }
                    result += 1
                }
            }
            i++
        }

        return result
    }
}
