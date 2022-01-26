package AAAAA

import java.io.File
import scala.io.Source

object FunctionTrait extends App {

  def sum(a: Int, b: Int, fxn: Function2[Int, Int, Int]) = fxn(a, b)

  val ss = (a: Int, b: Int, fxn: Function2[Int, Int, Int]) => fxn(a, b)
  println(sum(1, 2, _ + _))
  println(ss(1, 2, _ - _))

}
