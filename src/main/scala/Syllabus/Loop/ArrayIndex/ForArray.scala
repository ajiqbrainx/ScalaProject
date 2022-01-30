package Syllabus.Loop.ArrayIndex

object ForArray extends App {

  val a = Array("Ajith", "Ashok", "Abi")
  val b = a.length

  var index = 0

  for (i <- 1 to b) {

    if (a(index) == "Ashok") println(index)
    index = index + 1
  }

  //  println(index)
}
