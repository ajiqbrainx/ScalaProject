package DailyTask

import scala.concurrent.{ExecutionContext, Future}
//import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object FutureEg extends App {

  val ex=new ExecutionContext {
    override def execute(runnable: Runnable): Unit = ???

    override def reportFailure(cause: Throwable): Unit = ???
  }

   implicit val ec: ExecutionContext= ExecutionContext.global
  //callby Reference
  val reference = Future {
    println("Future")
    88
  }(ec)

  val value=Future(23)
  println(value)
  println(reference)

  reference.onComplete
  {
    case Success(value) => println(value)
    case Failure(exception) => println(exception)
  }

}
