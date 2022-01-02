package Jan02

object MatchCase extends App {

  val a = 6

  def condition(x: Int): Boolean = x % 2 == 0

  a match {
    case x if condition(a) => println("It is divisible by 2")
  }
  val b = a match {
    case x if x % 2 == 0 => x / 2
  }
  println(b)
}
