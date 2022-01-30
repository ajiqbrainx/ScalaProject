package Syllabus.Loop.ArrayIndex

object WhileArray extends App {

  val a = Array("Ajith", "Ashok", "Abi")
  val b = a.length
  var index = 0

  while (index < b) {
    if (a(index) == "Ajith") println(index)
    index = index + 1
  }

}
