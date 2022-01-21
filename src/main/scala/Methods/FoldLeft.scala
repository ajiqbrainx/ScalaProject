package Methods

object FoldLeft extends App {

  val foldLeft = List(1, 2, 3, 4, 5)
  // Fold method in scala Higher order function
  val add = foldLeft.foldLeft(1)((x, y) => x + y) //First (1) its giving value to function Then your condition gives
  val add1 = foldLeft.foldLeft(1)(_ + _) //while card pattern
  println(foldLeft)
  println("(1)(x,y)=> 1+1 = 2 =>, 2+2 =4 => ,4+3 =7 =>,7+4 =11 => ,11+5 =16 =>Ans= 16 ")
  println(add)
  println(add1)

  println("*******Subtraction  *******")
println(foldLeft)
  val sub = foldLeft.foldLeft(0)((x, y) => x - y)  //Im using Subtraction
  val sub1 = foldLeft.foldLeft(1)(_ - _)   //while card pattern
  println(sub)
  println(sub1)

  println("*******Multiplication  *******")
  println(foldLeft)
  val mul = foldLeft.foldLeft(0)((x, y) => x * y)  //Im using Subtraction
  val mul1 = foldLeft.foldLeft(1)(_ * _)   //while card pattern
  println(mul)
  println(mul1)



}