package AAAAA

import scala.concurrent.ExecutionContext

object ParasiticExecutionContext extends ExecutionContext {
  override def execute(runnable: Runnable): Unit = {
    runnable.run()
  }

  override def reportFailure(cause: Throwable): Unit = ???
}
