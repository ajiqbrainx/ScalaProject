package Syllabus.Loop

import scala.annotation.tailrec

object FactRecursion extends App {
  @tailrec
  def fact(n:Int, mul: Int): Any = {
    if (n == 0) mul
    else fact(n-1, mul * n)
  }

  println(fact(10, 1))
}
