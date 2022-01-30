package Syllabus.Loop.Fact

import scala.annotation.tailrec

object FactTailRecursion extends App {
  @tailrec
  def fact(n: Int, mul: Int): Any = {
    if (n == 0) mul
    else fact(n - 1, mul * n)
  }

  println(fact(5, 1))
}
