package Practise.ArrayExample

object ArraySameFirstLastCheck extends App {

  def check(x: Int, y: Array[Int]): Boolean = {
    if (y.head == y.last) true
    else false
  }

  val y = Array(1, 233, 3343, 4, 1, 3)
  val x = 1
  println(check(x, y))

  println("**************")
  val index = Array("Ajith", "Ashok", "Abi", "Akil", "Aji")
  println(index.indexOf("Ajith "))

}
