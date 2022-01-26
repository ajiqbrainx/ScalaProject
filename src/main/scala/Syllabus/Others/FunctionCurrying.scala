package Syllabus.Others

import scala.math.Fractional.Implicits.infixFractionalOps

object FunctionCurrying extends App {


  def sum(a: Int)(b: Int) = // Function takes Group of Arguments
    a + b // Into Single Arguments It is called Function currying


  println(sum(1)(2))

  // ****************

  val partially = sum(1)(_) // Partially Applied Function
  val aa: (Int, Int) => Int = (a, b) => a + b
  val bb: (Int, Int) => Int = (c, d) => c - d


  val cc: (Int, Int) => Int = (a, b) => a + b

  val ss: Int => Int = aa(1, _)
  val dd = bb(1, _)
  println(ss(2))
  println(dd(3))

  println(partially(4))

}
