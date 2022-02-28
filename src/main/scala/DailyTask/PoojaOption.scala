package DailyTask

import java.security.Principal
import scala.util.Failure

object PoojaOption extends App {

  val name: PartialFunction[Any, String] = {
    case name: String => name
    case _ => "Poojaa"
  }
  //  println(name("Pooja"))
  //  println(name(23))
  //
  //
  //  def optionSample(name : Any):Any ={
  //    name match {
  //      case n : String => Some(n)
  //      case _ => None
  //    }
  //  }
  //  println(optionSample("scala"))
  //  println(optionSample(22))

  //  val name: PartialFunction[Any, Either[String, String]] = {
  //    case name: String => Right(name)
  //    case _ => Left(throw new IllegalArgumentException)
  //  }

  //  println(name("Ajith"))
  //println(name(23))


  def eitherSample(a: Any): Either[Nothing, Any] = {
    a match {
      case a: Any => Right(a)
      case _ => Left(throw new Exception)
    }
  }

  println(eitherSample("Pooja"))
  println(eitherSample(99))

  //val aa:(Int,Int)=> Int = (a:Int,)
  val add = (sum: Int, a: Int) => sum + a
  val sub: (Int, Int) => Int = (a, b) => a - b

  val mul = (a: Int, b: Int) => a + b

  println(add(2, 6))
  println(sub(1, 2))

}
