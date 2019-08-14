class Deque<T> {

    var list = mutableListOf<Node<T>>()

    fun push(value: T) {
        val node = Node(value)
        node.prev = if (list.isNotEmpty()) list.last() else null
        list.add(node)
    }

    fun pop(): T {
        if (list.isNotEmpty() && list.size > 1) list[list.lastIndex - 1].next = null
        return list.removeAt(list.lastIndex).data
    }

    fun shift(): T {
        if (list.isNotEmpty() && list.size > 1) list[1].prev = null
        return list.removeAt(0).data
    }

    fun unshift(value: T) {
        val node = Node(value)
        node.next = if (list.isNotEmpty()) list[0] else null
        list.add(0, node)
    }
}

class Node<T>(var data: T) {
    var prev: Node<T>? = null
    var next: Node<T>? = null
}