package Syllabus.Others

object ImpureFunction extends App {
  var x = 1

  def sum(A: Int) = {
    x = A + 1
    x
  }

  println(sum(1))
}
