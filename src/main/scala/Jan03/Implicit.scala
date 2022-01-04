package Jan03

object Implicit extends App {

  val partialFunction:PartialFunction[Int,String]={
    case y if (y%2)==0 => s"$y"
    case _=>"Y"
  }
  println(partialFunction(4))


  implicit val integer1 = 67
  implicit val double1 = 67.4
  implicit val bool = true
  implicit val string="Ajith"


  def implicit1(a: Int)(implicit b: Int): Int = a + b

  def nonimplict(a: Int)(b: Int)(c: String) = a + b


  val a: Int = implicit1(2)
  val b: Int => String => Int = nonimplict(1)
  println(implicit1(1))


  def implicit2(a: Int)(implicit c: Int, d:Boolean, e: Double): Any = a + c + e

  val bb = implicit2(12)
  val bb1 = implicit2(12)
  println(bb)
println(bb1)



}
