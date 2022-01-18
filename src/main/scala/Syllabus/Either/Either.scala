package Syllabus.Either

object Either extends App {

  def check(a: String): Either[String, String] = {
    if (a.isEmpty) {
      Left("It has no name")
    }
    else Right(a)
  }

  println(check("Ajith"))
  println(check(""))


  check("Ajith") match {
    case Right(value) => println(value)
    case Left(value) => println("NO value")
  }

}
