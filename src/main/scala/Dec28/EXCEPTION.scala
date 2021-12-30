package Dec28

import scala.util.Try

object EXCEPTION extends App {
  def nullexception(a:String)={
    if(a.nonEmpty){
      a
    }
    else 0
  }
println(nullexception("Ajith"))
  println(nullexception(null))
}
