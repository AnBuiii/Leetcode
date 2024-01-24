package structure

import java.util.*

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null

    companion object {
        fun fromArray(tree: Array<Int?>): TreeNode? {
            if (tree.isEmpty() || tree[0] == null) return null
            val root = TreeNode(tree[0]!!)
            val queue: Queue<TreeNode?> = LinkedList()
            queue.add(root)
            for (i in 1 until tree.size) {
                val node = queue.peek() ?: continue
                val `val` = tree[i] ?: continue
                if (node.left == null) {
                    node.left = TreeNode(`val`)
                    queue.add(node.left)
                } else if (node.right == null) {
                    node.right = TreeNode(`val`)
                    queue.add(node.right)
                    queue.remove()
                }
            }
            return root
        }
    }
}



