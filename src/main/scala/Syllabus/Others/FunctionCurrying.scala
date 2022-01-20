package Syllabus.Others

object FunctionCurrying extends App {


  def sum(a:Int)(b:Int)=  // Function takes Group of Arguments
    a+b                         // Into Single Arguments It is called Function currying


  println(sum(1)(2))

  // ****************

  val partially =sum(1)(_)   // Partially Applied Function

  println(partially(4))

}
