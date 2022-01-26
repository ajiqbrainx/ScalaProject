package Test


import scala.annotation.tailrec

object fibnocci extends App {

  def fib(n: Int): Int = {
    @tailrec
    def fd(n: Int, pre: Int, cur: Int): Int = {
      if (n <= 0) pre
      else fd(n - 1, cur, pre + cur)
    }

    fd(n, 0, 1)
  }

  println(fib(5))
}