package Dec28

import scala.util.{Failure, Success, Try}

object TryExample extends App {

  val ss=Try(10/5)
  println(ss)
  val jj=Try(10/0)
  println(jj)



}