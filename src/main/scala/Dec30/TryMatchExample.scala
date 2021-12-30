package Dec30

import scala.util.{Failure, Success, Try}

object TryMatchExample extends App {

  def sum(a: Int) = 100 / a

  Try(sum(0)) match {
    case Success(value) => println(value)
    case Failure(exception) => println(exception.toString)
  }

}
