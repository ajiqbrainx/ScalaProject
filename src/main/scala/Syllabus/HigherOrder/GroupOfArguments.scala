package Syllabus.HigherOrder

object GroupOfArguments extends App {

  def group(a: Int)(b: Int)(c: Int): Int = a + b + c

  println(group(1)(2)(3))

  def group1(a: Int)(b: Int)(c: Int): Int => Int = c => a + b + c

  println(group1(1)(2)(3)(5))
}
