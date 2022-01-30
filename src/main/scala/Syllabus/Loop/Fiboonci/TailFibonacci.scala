package Syllabus.Loop.Fiboonci

import scala.annotation.tailrec

object TailFibonacci extends App {

  def fib(n: Int) = {

    @tailrec
    def fibonacci(n: Int, pre: Int, cur: Int): Any = {
      if (n <= 0) pre
      else fibonacci(n-1,cur,pre+cur)
    }
    fibonacci(n,0,1)
  }
  println(fib(7))
}

