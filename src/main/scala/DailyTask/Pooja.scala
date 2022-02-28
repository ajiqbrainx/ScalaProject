package DailyTask

import scala.util.{Failure, Success, Try}

object Pooja extends App {

  //    val aa: Try[String] =
  //  val bb = aa match {
  //    case aa:Try[String] => Success
  //    case _ => Failure
  ////  }
  //  println(aa())
  //  //  println(aa)
  //
    val name: PartialFunction[Any, String] = {
      case name:String => name
      case _=> throw new IllegalArgumentException
    }
  //
    println(name("Ajith"))
    println(name(23))

  //  def trySample(name: String) = {
  //    name match {
  //      case name: String => Success(name)
  //      case _=> Failure
  //    }
  //    println(trySample("pooja"))


  def name1(name1: Any) = {
    name1 match {
      case name: String => Success(name)
      case _ => Failure(throw new IllegalArgumentException)
    }
  }


  println(name1("Ajith"))
  println(name1(23))
}
