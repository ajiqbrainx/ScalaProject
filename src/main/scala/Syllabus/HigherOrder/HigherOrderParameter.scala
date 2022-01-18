package Syllabus.HigherOrder

object HigherOrderParameter extends App {
  def print(a: Int, b: Int, fxn: (Int, Int) => Int): Int = fxn(a, b)

  println(print(1, 2, _ + _))
  println(print(1, 2, _ - _))
  println(print(1, 2, _ * _))
  println(print(1, 2, _ / _))
}
