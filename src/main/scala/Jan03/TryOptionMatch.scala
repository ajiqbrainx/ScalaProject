package Jan03

import scala.util.{Failure, Success, Try}

object TryOptionMatch extends App {
  val triedOptionOfInt: Try[Option[Int]] = Try(None)
  triedOptionOfInt match {
    case Success(Some(value: Int)) => println(value)
    case Success(None) => println("No Value")
    case Failure(exception) =>
      exception.printStackTrace()
  }
  println()
}
