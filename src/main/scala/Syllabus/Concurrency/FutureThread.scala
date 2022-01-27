package Syllabus.Concurrency

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object FutureThread extends App {

  val future: Future[Int] = Future {
    println("Future main")
    24
  }
  Thread.sleep(100)
  println(future)
  val future1 = Future(23)
//  Thread.sleep(100)
  println(future1)
}
