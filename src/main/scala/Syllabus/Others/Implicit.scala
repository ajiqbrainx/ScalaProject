package Syllabus.Others

import Jan03.Implicit

object ImplicitEx extends App {

  implicit val int = 10
implicit  val double=10.0
  def sum( a:Int)(implicit b:Int,c:Double)=a+b+c

val add=sum(1)
println(add)
  println(sum(12))

}
