package Dec21

object Lamda extends App {
  def ss(a: Int, b: Double)(c: String)(d: Boolean) = a + b + c + d


  val x: String => Boolean => String = ss(1, 10.3)
  val x1: Boolean => String = x("Ajith")
  val x2: String = x1(false)
  println(x2)


  def met1: (Int, Int) => String => Boolean => String =
    (a, b) => c => d => c + "  " + a + "  " + b + "  " + d

  val y: String => Boolean => String = met1(1, 3)
  val y1: Boolean => String = y("Ajithj")
  val y2: String = y1(true)
  println(y2)

}
