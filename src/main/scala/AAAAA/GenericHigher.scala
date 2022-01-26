package AAAAA

import scala.math.Fractional.Implicits.infixFractionalOps

object GenericHigher extends App {

  def add[T](a: T, b: T, fxn: (T, T) => T) = fxn(a, b)

  def mul(a: Int, b: Int, fxn: (Int, Int) => Int) = fxn(a, b)

//  println(add(1, 2, (a, b) => a + b))
  println(mul(1, 2, (a, b) => a + b))
}
