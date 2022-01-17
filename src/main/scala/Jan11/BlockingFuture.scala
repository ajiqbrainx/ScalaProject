package Jan11
import java.time.Duration
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.DurationInt
import scala.concurrent.{Await, Future}
import scala.language.postfixOps

object BlockingFuture extends App{

  println("_______1_______")

val future =Future{
  println("_______2______"+Thread.currentThread().getName)
  Thread.sleep(1000)
  89
}

  val future1 =Future{
    println("_______3______"+Thread.currentThread().getName)
    Thread.sleep(1000)
    67
  }

  val result=Await.ready(future,4 seconds)
  println("________4_____")

  println(future)
  println(result)
}
