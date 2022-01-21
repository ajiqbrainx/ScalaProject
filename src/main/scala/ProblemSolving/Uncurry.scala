package ProblemSolving

object Uncurry extends App {
  def uncurry[A, B, C](f: A => B => C): (A, B) => C =
    (a, b) => f(a)(b)

  def f(a: Int, b: Int): Int = a + b

  def g(a: Int)(b: Int): Int = a + b

  println(uncurry(g)(1, 1) == g(1)(1))

  println(uncurry(g)(1, 1) == f(1, 1))


}
