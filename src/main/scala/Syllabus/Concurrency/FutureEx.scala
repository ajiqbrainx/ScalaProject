package Syllabus.Concurrency

import scala.concurrent.{ExecutionContext, Future}

object FutureEx extends App {

  implicit val ec:ExecutionContext=new MyExecutionContext

  val future=Future{
//    Thread.sleep(500)
    println(Thread.currentThread().getName)
    55
  }
  val future1=Future{
    println(Thread.currentThread().getName)
  }
Thread.sleep(1000)
println(future.isCompleted)


}
