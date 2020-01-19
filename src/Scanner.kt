import java.util.*

private var queue: Queue<Char> = LinkedList()

fun Scanner.nextChar(): Char {
    return queue.poll() ?: run {
        for (ch in next()) queue.add(ch)
        nextChar()
    }
}
