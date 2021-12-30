package PractiseWork

import scala.util.{Failure, Success, Try}

object TupleExample extends App {

  val tuple = (12, "Ajith")

  tuple match {
    case (i, str) => println(str, i)
    case _ => "NO"
  }

  val ttt: ((Int, String), Double) = ((12, "Ajith"), 12.4)

  Try(ttt) match {
    case Success(value) => println(value)
    case Failure(exception) => println(exception.toString)
    case _=>println("No value")
  }
}