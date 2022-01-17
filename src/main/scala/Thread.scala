import scala.util.{Failure, Success}

object Function extends App {

  def higher(a: Int, b: Int): String => String = c => a + b + c

  println(higher(1, 2)("Ajith"))

  def ss(a: Int, b: Int, fxn: (Int, Int) => Int): Int = fxn(a, b)

  println(ss(25, 25, _ + _))

  val a = Option(23)
  a match {
    case Some(value) => println(value)
    case None => println("NO value")
  }


  val a1: PartialFunction[Int,Any] = {
    case a1 if a1 / 2 == 10 => a1 + a1
    case _ => 0.1
  }
  println(a1(20))
}
