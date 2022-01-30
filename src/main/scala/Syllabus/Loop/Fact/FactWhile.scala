package Syllabus.Loop.Fact

object FactWhile extends App {

  var n = 5
  var fact = 1
  while (n > 0) {
    println(fact)
    fact = fact * n
    println(fact)
    n = n - 1
  }
  println(fact)
}
