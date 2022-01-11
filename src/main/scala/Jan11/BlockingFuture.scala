package Jan11
import java.time.Duration
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Await, Future}

object BlockingFuture extends App{

  println("_______1_______")

val future =Future{

  println("_______2______"+Thread.currentThread().getName)
  Thread.sleep(1000)
  89
}

//  val result=Await.result(future, Duration.)
  println("________3_____")
}
