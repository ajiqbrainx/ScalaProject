package Syllabus.Loop.ArrayIndex

import scala.annotation.tailrec

object RecursionArray extends App {


  def arrayin(a: Array[String], indx: Int): Unit = {
    if (a(indx) == "Aji") indx
    else arrayin(a, indx + 1)
    println(indx)
  }

  arrayin(Array("Aji", "Ash"), 0)
}
