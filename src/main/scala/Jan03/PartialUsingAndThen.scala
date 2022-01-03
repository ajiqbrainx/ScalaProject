package Jan03

object PartialUsingAndThen extends App {

  val M: PartialFunction[Int, Int] = {
    case x if (x % 4) != 0 => x * 4
  }
  println(M(1))
  println("************")
  val append = (x: Int) => x * 10
  println(append(1))
  println("************")
  val x = (y: Int) => y + y
  println(x(1))
  println("***********")
  val y = M andThen append andThen x
  println(y(1))
}
