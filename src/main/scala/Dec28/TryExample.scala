package Dec28

import scala.util.{Failure, Success, Try}

object TryExample extends App {

  val ss=Try(10/5)
  println(ss)
  val jj=Try(null)
  println(jj)



}