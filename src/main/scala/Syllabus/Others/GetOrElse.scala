package Syllabus.Others

object GetOrElse extends App {

  val x: Option[Int] = Some(10)
  val y = None

  println(x.getOrElse(0))
  println(y.getOrElse(0))
  println(x.isEmpty)
  println(y.isEmpty)
  val p = new PartialFunction[Int, Int] {
    override def isDefinedAt(x: Int): Boolean = x != 0

    override def apply(x: Int): Int = x * x
  }
  println(p(5))
}
