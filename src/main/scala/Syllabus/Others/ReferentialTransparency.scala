package Syllabus.Others

object ReferentialTransparency extends App {

  def sq(x: Int): Int = x * x

  def sq1(x: Int): Int = {
    println(s"X is $x")
    x * x
  }

  println(sq(4))
  println(sq1(4))
  println(4 * 4)
}
