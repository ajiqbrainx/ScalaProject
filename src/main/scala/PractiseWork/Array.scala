package PractiseWork

import scala.{+:, :+}


object GFG extends App{

println("*********** ******")
    var list1 = Array(1, 2,3, 4, 5, 6)

   for (i <- list1) {
      print(i+ " ")
    }
    println()
    val ss= list1.tail :+ list1.head
    for (i <- ss ) {
      print(i+" ")
    }
    println()
  val ss1=ss.tail :+ ss.head
  for (i <- ss1) {
    print(i+" ")
  }
}
