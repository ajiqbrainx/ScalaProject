package Jan02

object PartialFunction extends App {
  val partialFunction11=new PartialFunction[Int,Int]{
    override def isDefinedAt(x: Int): Boolean = x==0

    override def apply(v1: Int): Int = v1+v1
  }
  println(partialFunction11.isDefinedAt(1))
  println(partialFunction11.apply(21))
  println("********555*****")
  val partialFunction: PartialFunction[Int, Int] = {
    case x if x > 10 => x + 1
    case y if y < 10 => y + 1
  }
  println(partialFunction(78))

  val partialFunction1: PartialFunction[Int, Option[Int]] = {
    case x if x > 10 => Some(100 / x)
    case x if x < 10 => None
  }
  println("***************")
  println(partialFunction1(20))
  println(partialFunction1(5))
  val lift: Int => Option[Int] = partialFunction.lift
  println("*********************** ")
  println(lift(11))
  println(lift(5))

}