package Maximum_Depth_of_Binary_Tree

import structure.TreeNode

fun main() {
    val solution = Solution()
    val node = TreeNode(3)
    node.left = TreeNode(9)
    node.right = TreeNode(20)
    node.right?.left = TreeNode(15)
    node.right?.right = TreeNode(7)
    println(solution.maxDepth(node))
}

/**
 * compare height of left to right of [TreeNode]
 */
class Solution {
    fun maxDepth(root: TreeNode?): Int {
        if(root == null) return 0
        return maxOf(
            1 + maxDepth(root.left),
            1 + maxDepth(root.right)
        )
    }
}