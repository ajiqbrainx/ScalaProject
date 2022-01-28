package Syllabus.Recursion

object ArrayIndexCheck extends App {

//
//  var a = Array("Ajith", "Abi", "Aji")
//  var index = 0
//
//  // loop execution
//  while (index < a.length) {
//    if (a(index) == "Aji")
//      println("index of while is " + index)
//    index = index + 1
//  }
//
//
//

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
