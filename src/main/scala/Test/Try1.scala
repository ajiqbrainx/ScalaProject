package Test

import scala.util.{Failure, Success, Try}

object Try1 extends App {

  val name: PartialFunction[Any, Try[String]] = {
    case name: String => Success(name)
    case _ => Failure(throw new IllegalThreadStateException)
  }

//  println( name("Ajith"))
//  println(name(233))

  def optionExample(name:Any): Try[String] ={
    name match {
      case name:String => Success(name)
      case _=> Failure(throw new IllegalArgumentException)
    }
  }

println(optionExample("Ajith"))
println(optionExample(23))
}
