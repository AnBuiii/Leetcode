package Out_of_Boundary_Paths

import structure.MODULE

/**
 * 3-d dp
 * if we still inside the grid, add 4 direction moves
 */

class Solution {
    private val dp = Array(51) { Array(51) { IntArray(51) { -1 } } }
    fun findPaths(m: Int, n: Int, maxMove: Int, startRow: Int, startColumn: Int): Int {
        if (startRow !in 0..<m || startColumn !in 0..<n) {
            return if (maxMove >= 0) 1
            else 0
        }
        if (maxMove == 0) return 0
        if (dp[startColumn][startRow][maxMove] != -1) return dp[startColumn][startRow][maxMove]

        var result = 0

        result += findPaths(m, n, maxMove - 1, startRow, startColumn + 1) % MODULE
        result %= MODULE
        result += findPaths(m, n, maxMove - 1, startRow + 1, startColumn) % MODULE
        result %= MODULE
        result += (findPaths(m, n, maxMove - 1, startRow - 1, startColumn) % MODULE)
        result %= MODULE
        result += findPaths(m, n, maxMove - 1, startRow, startColumn - 1) % MODULE
        result %= MODULE
        dp[startColumn][startRow][maxMove] = result
        return result
    }
}