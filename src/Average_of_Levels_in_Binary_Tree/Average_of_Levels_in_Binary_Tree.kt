package Average_of_Levels_in_Binary_Tree

import structure.TreeNode

/**
 * 1. DFS to group all node by level to a [HashMap]
 * 2. calculate average
 */
class Solution {
    private val hash = hashMapOf<Int, IntArray>()
    fun averageOfLevels(root: TreeNode?): DoubleArray {
        dfs(root, 0)
        val result = DoubleArray(hash.size)
        for (i in result.indices) {
            result[i] = hash[i]?.average() ?: 0.0
        }
        return result
    }

    private fun dfs(root: TreeNode?, level: Int) {
        if (root == null) return

        if (hash[level] != null) {
            hash[level] = hash[level] as IntArray + root.`val`
        } else {
            hash[level] = intArrayOf(root.`val`)
        }
        dfs(root.left, level + 1)
        dfs(root.right, level + 1)
    }
}