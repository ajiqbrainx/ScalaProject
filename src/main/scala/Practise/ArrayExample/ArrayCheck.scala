package Practise.ArrayExample

object ArrayCheck extends App {

  def test1(x: Int, y: Array[Int]): Boolean = {
    if (y.head == x || y.last == x) true
    else false
  }

  var y: Array[Int] = Array(1, 2)
  var x = 1
  println(test1(x, y))


}
