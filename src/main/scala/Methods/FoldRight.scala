package Methods

object FoldRight extends App {

  val foldRight = List(1, 2, 3, 4, 5)

  val add = foldRight.foldRight(0)((x, y) => x + y)
  val add1 = foldRight.foldRight(1)(_ + _)
  println(foldRight)
  println(add)
  println(add1)
//  println(foldRight.fold())
}
