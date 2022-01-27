package Jan11

import scala.concurrent.{Future, Promise}
import scala.concurrent.ExecutionContext.Implicits.global
object PromiseEx extends App {

//
  val promise = Promise[Int]()


  promise.future.onComplete(println)

  val future: Future[Int] = Future.successful(23)
  val future1: Future[Int] = Future.failed(new Exception("Asas"))
//
//  println("*************")
//  val f = Future { 1 }
//  val p = Promise[Int]()
//
//  p completeWith f
//
//  p.future foreach { x =>
//    println(x)
//  }

  def aCompletedPromiseUsingSuccess(num:Int): Future[Int] = {
    val promise=Promise[Int]()
    promise.success(num)
    promise.failure(new Exception("Error occurs"))
    promise.future

  }
println(aCompletedPromiseUsingSuccess(14))
  println(aCompletedPromiseUsingSuccess(10/0))


}
