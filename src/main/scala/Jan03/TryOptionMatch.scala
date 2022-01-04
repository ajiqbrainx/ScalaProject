package Jan03

import scala.util.{Failure, Success, Try}

object TryOptionMatch extends App {
  val triedOptionOfInt: Try[Option[Int]] = Try(Some(12))
  triedOptionOfInt match {
    case Success(Some(value: Int)) => println(value)
    case Success(None) => println("No Value")
    case Failure(exception) =>
      exception.printStackTrace()
  }
  println()
  Try(Option(None)) match {
    case Success(Some(value)) => println(value)
    case Success(None) => println("No Value")
    case Failure(exception) =>
      exception.printStackTrace()

  }
}