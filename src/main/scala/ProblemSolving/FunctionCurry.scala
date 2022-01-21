package ProblemSolving

object FunctionCurry extends App {
  def curry[A, B, C](f: (A, B) => C): A => (B => C) =
    a => b => f(a, b)

  def f(a: Int, b: Int): Int = a + b

  def g(a: Int)(b: Int): Int = a + b

  println(curry(f)(1)(1) == f(1, 1))

  println(curry(f)(1)(0) == g(1)(0))


}
