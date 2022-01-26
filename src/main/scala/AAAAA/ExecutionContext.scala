package AAAAA

import scala.concurrent.duration.{Duration, FiniteDuration}
import scala.concurrent.{Await, ExecutionContext, Future}
import scala.concurrent.ExecutionContext.Implicits.global
object ExecutionContext extends App{
   val ec =new  MyExecutionContext

  val f: Future[Int] = Future(2222)(ec)
  println(f)
val ss=Await.ready(f,Duration.Inf)
  println(ss)

}

import scala.concurrent.ExecutionContext

class MyExecutionContext extends ExecutionContext {

  override def execute(runnable: Runnable): Unit = {
    println(s"Task is submitted by -> ${Thread.currentThread().getName}")
    val thread = new Thread(runnable)
    println(s"Task is submitted to -> ${thread.getName}")
    thread.start()
    println(s"Task finished submitting by -> ${Thread.currentThread().getName}")
  }

  override def reportFailure(cause: Throwable): Unit = new Exception
}
