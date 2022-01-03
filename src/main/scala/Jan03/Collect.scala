package Jan03

object Collect extends App {
  val M: PartialFunction[Int, Int] = {
    case x if (x % 5) == 0 => x * 5
  }
  //  println(M(5))
  val M1: PartialFunction[Int, Option[Int]] = {
    case x if (x % 4) == 0 => Some(x * 4)
    case x => None
  }
  println(M1(11))
  println(M1(12).get)
  val y = List(7, 15, 9, 12) collect M1
  println(y)


}
