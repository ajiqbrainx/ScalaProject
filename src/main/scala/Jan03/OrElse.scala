package Jan03

object OrElse extends App {
  val m: PartialFunction[Int, Int] = {
    case y if (y % 2) == 0 => y * 2
    case y if (y % 3) == 0 => y * 3
  }
  val M: PartialFunction[Int, Int] = {
    case x if (x % 5) == 0 => x * 5
  }
  val s: PartialFunction[Int, Int] = {
    case y if (y % 10) == 0 => y * 10
  }
  println("^^^^^^^^^^^^")
  println(s(10))
  val r = M orElse m
  val t = M orElse s
  println(r(5))
  println(r(4))
  println("&&&&&&&&&&&")
  println(r(20))
  println(r(3))
  println("_____________")
  println(t(10))


}
