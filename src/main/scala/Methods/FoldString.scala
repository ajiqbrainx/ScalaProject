package Methods

object FoldString extends App {

  val list = List("Ajith", "Ashok", "Abi", "Akil", "Akon")
  val foldstring = list.foldRight("Hi")((x, y) => s" $x " + s" $y ")
  println(list)
  println(foldstring)

  val fold=List(1, 2, 3, 4, 5).fold(1)(_ + _)
  val foldleft=List(1, 2, 3, 4, 5).foldLeft(1)(_ + _)
  val foldright= List(1, 2, 3, 4, 5).foldRight(1)(_ + _)

  println(fold)
  println(foldleft)
  println(foldright)

}
