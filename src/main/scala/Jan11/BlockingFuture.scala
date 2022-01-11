package Jan11
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
object BlockingFuture extends App{
println("*****1******")
  val future=Future(23)
  println(future+"2")
  println("*****3******")


}
