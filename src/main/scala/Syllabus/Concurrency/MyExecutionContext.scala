package Syllabus.Concurrency
import scala.concurrent.ExecutionContext
class MyExecutionContext extends ExecutionContext {
  override def execute(runnable: Runnable): Unit = {
    val thread=new Thread(runnable)
    println(s"${thread.getName}")
    thread.start()
  }

  override def reportFailure(cause: Throwable): Unit = ???
}
