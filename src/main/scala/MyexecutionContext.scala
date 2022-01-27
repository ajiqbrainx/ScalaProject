import scala.concurrent.{ExecutionContext, Future}

class MyexecutionContext1 extends ExecutionContext {
  override def execute(runnable: Runnable): Unit = {
    println("Success is ====")
    new Thread(runnable).run()
  }

  override def reportFailure(cause: Throwable): Unit = {
    println("Failure is === ")
    cause.getMessage
  }
}

object Ajith extends App{

  implicit val ec:ExecutionContext= new MyexecutionContext1

  val future=Future{
    println("Future1")
    20/2
  }
  println(future)
  println("*********")
  val future1=Future{
    println("Future2")
    20/0
  }
  println(future1)
}