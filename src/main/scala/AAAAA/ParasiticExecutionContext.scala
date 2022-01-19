package AAAAA

import scala.concurrent.{ExecutionContext, Future}

object ParasiticExecutionContext extends ExecutionContext {
  override def execute(runnable: Runnable): Unit = {
    runnable.run()

//    val thread=new Thread(runnable)
//    thread.start()
  }

  override def reportFailure(cause: Throwable): Unit = ???
}

