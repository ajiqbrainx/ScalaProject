package Dec28

import scala.util.{Failure, Success, Try}

object TryCatch extends App {
  def ss(A:Int,B:Int)={
    Try (A/B)match {
      case Success(a)=>a
      case Failure(a)=>println("Its getting Error")
    }
  }
println(ss(3,5))

}




