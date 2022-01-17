import scala.concurrent.{ExecutionContext, Future}

object Main extends App {

  implicit val ec: ExecutionContext = ParasiticExecutionContext

  case class A(a: String)

  val a: Future[A] = Future("jeee")(ExecutionContext.global).map(A)(ExecutionContext.parasitic)

  println(Thread.currentThread().getName)

  Future {
    println(Thread.currentThread().getName + "aJITH")
    34
  }


  Future {
    println(Thread.currentThread().getName + "222")
  }


  Future {
    println(Thread.currentThread().getName +"33")
  }


  val ss =Future {
    println(Thread.currentThread().getName +"$$")
90
  }
val ss1=Future(67)
  println(Thread.currentThread().getName)
  println(ss)
  println(ss1)
}
