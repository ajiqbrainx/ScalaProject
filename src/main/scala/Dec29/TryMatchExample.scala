package Dec29

import java.lang.Exception
import scala.util.{Failure, Success, Try}

object TryMatchExample extends App {
  def name(x:String)={
    if(x.nonEmpty)
      {
        Success(x)
    }
    else Failure(new Exception("It is not "))
  }
  println(name("Ajith"))
  println(name(""))
}
