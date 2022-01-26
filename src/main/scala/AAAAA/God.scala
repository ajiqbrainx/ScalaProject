package AAAAA

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object God extends App {

  val future1 = Future(12)

  println(future1)
  println()

  future1.isCompleted

  println(future1)
  future1.onComplete {
    case Success(value) => println(value)
    case Failure(exception) => println(exception.getMessage)
  }

  println(future1)
}
