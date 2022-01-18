package Syllabus.Try

import scala.util.{Failure, Success}

object Try extends App {

  val success =Success(12)
val ss=Success.apply(11)
  println(ss)
  val failure=Failure(new Exception("No value in this"))
println(failure)
  val option =Option(4)
  println(option)
}
