package Jan11

import scala.concurrent.{Future, Promise}
import scala.concurrent.ExecutionContext.Implicits.global
object PromiseEx extends App {


  val promise = Promise[Int]()


  promise.future.onComplete(println)

  val future: Future[Int] = Future.successful(23)
  val future1: Future[Int] = Future.failed(new Exception("Asas"))



}
