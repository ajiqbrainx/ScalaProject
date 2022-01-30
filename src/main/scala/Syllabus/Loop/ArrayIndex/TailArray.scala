package Syllabus.Loop.ArrayIndex

object TailArray extends App {


  val a1 = Array("Ajith", "Abi", "Ashok", "Akon", "Akil")
  println(a1(2))


  def array(a: Array[String], Index: Int): Any = {
    if (a(Index) == "Abi") {
      println("Index Of the name is = " + Index)
    }

    else array(a, Index + 1)
  }

  array(Array("Ajith", "Abi", "Ashok", "Akon", "Akil"), 0)
}
