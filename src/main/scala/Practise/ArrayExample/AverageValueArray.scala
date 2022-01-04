package Practise.ArrayExample

object AverageValueArray extends App {

  val x = Array(5, 5, 5, 5, 4)
  var total = 0
  for (i <- 0 to x.length - 1) {
    total += x(i)
  }
  println("Total value = " + total)
  println("Average value = " + total / x.length)
}
