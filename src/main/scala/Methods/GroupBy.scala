package Methods

import scala.collection.mutable.ArrayBuffer

object GroupBy extends App {

  val list = List("Ajith", "Abi", "Ashok", "Akil", "", "Aji", "A")
  val groupBy = list.groupBy(f => f.length).foreach(println)
  println(groupBy)

  println("*******Int******")
  val list1 = List(1, 2, 3, 4, 5, 6)
  val groupBy1 = list1.groupBy(f => f > 2)
  println(groupBy1)

  println("**********Array******")
  val array=ArrayBuffer(1,2,3,4,5,5).groupBy(_>2).foreach(println)

}
