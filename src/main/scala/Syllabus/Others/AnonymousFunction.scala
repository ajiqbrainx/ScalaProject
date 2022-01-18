package Syllabus.Others

object AnonymousFunction extends App {

  val x = ()

  def fun(a: Int, b: Int, Fxn: (Int, Int) => Int): Int = Fxn(a, b)

  println(fun(1, 2, (a, b) => a + b))
  println(fun(1, 2, _ + _)) //It is Anonymous Function using while card pattern
}
