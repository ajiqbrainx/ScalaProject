package PractiseWork

import scala.annotation.tailrec


object TailArraySize extends App {

  @tailrec
  def size(a: Array[String], Index: Int): Any = {
    if (a(Index).length < 5) println(a(Index))
    else size(a, Index + 1)

  }

  val b = Array("Ajith", "Ashok", "Abi", "aji")
  size(b, 0)
  println(b.indexWhere(_=="Ashok"))
}
