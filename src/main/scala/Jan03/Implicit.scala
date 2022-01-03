package Jan03

object Implicit extends App {

  implicit def ajith = 67


  def implicit1(a: Int)(implicit b: Int): Int = a + b

  def nonimplict(a: Int)(b: Int)(c: String) = a + b


  val a: Int = implicit1(2)
  val b: Int => String => Int = nonimplict(1)
  println(implicit1(1))


  def implicit2(a: Int)(implicit c: Int, d: String, e: Double) = a + c + e

  val bb: Double = implicit2(12)(ajith, "Ajith", 56.8)
  println(bb)


}
