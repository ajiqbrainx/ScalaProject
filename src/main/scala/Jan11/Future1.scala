package Jan11

import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.FiniteDuration
import scala.util.{Failure, Success}

object Future12 extends App {

  val fut = Future(10/0)
  val future = Future {
    println(Thread.currentThread().getName+"*****Future******")
    10
  }
  //  Thread.sleep(5000)
//  println(fut)
//  println(future)
  val threadname= new Thread ("Ajith")
 val ready=Await.ready(future,FiniteDuration(4,"seconds"))
  println(ready)


//  fut.onComplete {
//    case Success(value) => println(value)
//    case Failure(exception) => println(exception.getMessage)
//  }


}
