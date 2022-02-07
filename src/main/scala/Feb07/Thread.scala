package Feb07

//import java.time.Duration
import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration
import scala.language.postfixOps
import scala.util.{Failure, Success}

object Thread1 extends App {

  val runnable = new Runnable {
    override def run(): Unit = {
      println(Thread.currentThread().getName)
      2 + 2
    }
  }

  val future = Future {
    println(Thread.currentThread().getName)
    10 / 2
  }
val ready1=Await.ready(future,Duration.Inf)
  println(ready1)
//  println(runnable)
//  println(future)


//  future onComplete {
//    case Success(value) => println(value+Thread.currentThread().getName)
//    case Failure(exception) => println(exception.getMessage+Thread.currentThread().getName)
//  }


}
