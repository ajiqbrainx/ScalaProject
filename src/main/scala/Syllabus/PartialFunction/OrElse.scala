package Syllabus.PartialFunction

object OrElse extends App {

  val partialFunction1: PartialFunction[Int, Int] = {
    case x if x % 2 ==0 => x * x
  }
  val partialFunction2: PartialFunction[Int, Int] = {
    case x if x % 3 ==0 => x * x
  }

  val check= partialFunction1 orElse(partialFunction2)

  println(check(4))
  println(check(6))


}
