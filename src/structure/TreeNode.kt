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

    override fun equals(other: Any?): Boolean {
        other as TreeNode
        val a = this.`val` == other.`val`
        if((this.left == null && other.left != null) || (this.left != null && this.right == null) ){
            return false
        }
        if((this.right == null && other.right != null) || (this.right != null && this.right == right) ){
            return false
        }
        val b = this.left?.equals(other.left) ?: true
        val c = this.right?.equals(other.right) ?: true
        return  a && b && c
    }

    override fun hashCode(): Int {
        var result = `val`
        result = 31 * result + (left?.hashCode() ?: 0)
        result = 31 * result + (right?.hashCode() ?: 0)
        return result
    }
}



