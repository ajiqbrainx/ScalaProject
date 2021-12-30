package Practise

import scala.io.StdIn

object ReturnValueEqual extends App {

  def twonumbercheck(a:Int,b:Int):Boolean={
  a==30 || b==30 || a+b==30
  }
  println("Result is == "+twonumbercheck(23,45))
  println("Result is == "+twonumbercheck(30,0))
  println("Result is == "+twonumbercheck(0,30))
  println("Result is == "+twonumbercheck(15,15))
  println("Result is == "+twonumbercheck(23,1))




}
