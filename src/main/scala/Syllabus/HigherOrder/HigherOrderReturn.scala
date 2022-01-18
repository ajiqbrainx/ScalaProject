package Syllabus.HigherOrder

object HigherOrderReturn extends App {
  def print(a: Int, b: Int): Int => Int = c => a + b + c

  def print1(a: String, b: Int): String => String = c => s"Your name is = $a " +
    s"your Age is $b " +
    s"Your Company is $c "

  println(print(1, 2)(1))
  println(print1("Ajith", 23)("Qbrainx"))
}
