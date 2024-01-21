package structure

class ListNode(val `val`: Int) {
    var next: ListNode? = null
}

fun ListNode?.getString(): String {
    return if (this != null) {
        "${this.next.getString()}${this.`val`}"
    } else {
        ""
    }
}