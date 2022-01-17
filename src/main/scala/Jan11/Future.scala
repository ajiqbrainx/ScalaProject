package Jan11

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Await, Future}
import scala.util.{Failure, Success}

object Future1 extends App {

  println(Thread.currentThread().getName)

  val future: Future[Int] = Future {
//    Thread.sleep(50)
    println(Thread.currentThread().getName)
    24/4
  }
//Thread.sleep(100)
  println(future.value)
  println("&&&&&&&&&&&&")
  future1(future)
  println("************")
  Thread.sleep(100)
  future1(future)
println("&&&&&&&&&&&&&")
  println(future.value)
//Thread.sleep(50)

println(Thread.currentThread().getName)

  def future1[T](input:Future[T])=input.value match {
    case None=>println("No value")
    case Some(Success(value)) => println("Value is => "+value)
    case Some(Failure(exception)) =>println(exception.getMessage)
  }

}