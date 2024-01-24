package structure

class ListNode(val `val`: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        return "${this.next.toString()}${this.`val`}"
    }

    companion object {
        fun fromIntArrayOf(vararg elements: Int): ListNode? {
            if (elements.isEmpty()) return null
            val root = ListNode(0)
            var temp: ListNode? = root
            for (element in elements) {
                temp?.next = ListNode(element)
                temp = temp?.next
            }
            return root.next
        }

        fun ListNode?.toArray(): IntArray {
            val result = mutableListOf<Int>()
            var temp: ListNode? = this
            while (temp != null) {
                result.add(temp.`val`)
                temp = temp.next
            }
            return result.toIntArray()
        }
    }
}
