package Syllabus.Others

import Syllabus.Others.Apply11.unapply

class Apply11(val a: Int, val b: Int) {

}

object Apply11 {
  def apply(a: Int, b: Int): Apply11 = new Apply11(a, b)

  def unapply(arg: Apply11): Option[(Int, Int)] = Option(arg.a,arg.b)

}
object SS extends App{
  val apply11= Apply11.apply(1,2)
  println(apply11.a)
  println(apply11.b)

  val unapply12=Apply11.unapply(apply11)

  println(unapply(apply11))
}