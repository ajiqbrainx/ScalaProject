package Syllabus.Loop

object For extends App {

  val a = Array("Ajith", "Abi","Aji")
  val find=a.find(_=="Aji")
  println(find)
  val b = a.length
  println(b)
  var index = 0
  for (i <- 1 to b) {
    if (a(index) == "Aji") {
      println(index)
    }
    index = index + 1
  }

}
