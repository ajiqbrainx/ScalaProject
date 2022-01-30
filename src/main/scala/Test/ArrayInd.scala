package Test

import scala.annotation.tailrec

object ArrayInd extends App {

  val aa = Array("Ajith", "Ashok", "Abi", "Akil", "Akon", "Ajith")


  @tailrec
  def array(a: Array[String], Index: Int): Any = {

    if (a(Index) == "Ajith") {
      println("Index of the Array Element = " + Index)
    }
    else array(a, Index + 1)

  }

  //  array(Array("Ajith","Abi"), 0)
  array(aa, 0)

}
