package Syllabus.PartialFunction

object PartialFunction extends App {

  //New partial function create and implement method using

   val partialFunction = new PartialFunction[Int, Int] {
    override def isDefinedAt(x: Int): Boolean = x < 10

    override def apply(v1: Int): Int = v1 * v1
  }


  println(partialFunction.isDefinedAt(55))
  println(partialFunction.apply(2))


  // Return type of partial function

  val partialFunction1: PartialFunction[String, String] = {
    case x if x.nonEmpty => x
    case _ => "No value present here"

  }
  println(partialFunction1("Ajith"))
  println(partialFunction1(""))
}
