package Dec31

import scala.util.{Failure, Success, Try}

object TryExample extends App{

  def try1(s:String)={
    Try(s) match {
      case Success(value)=>value
      case Failure(exception)=>exception.getMessage
    }
  }

println(try1("Ajiht"))
}
