package Test

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}
//import scala.concurrent.ExecutionContext.Implicits.global

object PartialFunction extends App {

  //  //  def fun(a: Int, b: Int, fun1: (Int, Int) => Int): Int = fun1(a, b)
  //
  //  def fun(a: Int, b: Int, fun: (Int, Int) => Int): Int = fun(a, b)
  //
  //  println(fun(1, 2, (a, b) => a + b))
  //
  //  //  def sum(x: String, y: String, sum1: (String, String) => String): sum1
  //  //
  //  ////  :
  //  ////  = sum1(x, y)
  //
  //  //  println(sum("igu", "ugyiug"()
  //
  //  def sum(x: Int, y: Int): (Int, Int) => Int = (c, b) => c + b + x + y
  //
  //  println(sum(1, 2)(0, 0))
  //
  //  //  val aa = (a: Int, b: Int): Int => a + b

  val add = (a: Int, b: Int) => a + b
  val sub: (Int, Int) => Int = (a, b) => a - b
  //
  //  println(add(1, 2))
  //  println(sub(1, 2))


  def funCurrying(aa: Int, bb: Int, cc: Int, dd: Int): Int = aa + bb + cc + dd

  val aa = funCurrying(22, _, _, _)
  val bb = aa(2, _, _)
  val cc = bb(21, _)
  val dd = cc(55)

  //  println(dd)

  //  val future = Future{
  ////    println(Thread.currentThread().getName)
  //    23
  //  }
  val future1 = Future(21)
  //  println(future)
  println(future1.isCompleted)
  future1.onComplete {
    case Success(value) => println(value)
    case Failure(exception) => println(exception.getMessage)
  }


}
