package Practise.ArrayExample

object AddingSumList extends App {

  val nums = List(3, 4, 5)

  println("1.add the sum of the list for using a loop  ")
  var total = 0
  for (x <- 0 to nums.length - 1) {
    total += nums(x)
  }
  println(total)
  val sum1 = nums.sum
  println(sum1)
  println(total == sum1)
}
