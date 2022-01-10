package Jan07

object ForYield extends App {
  val a = List(1, 2, 3, 4, 5)

  val s = for {
    ele <- a
  } yield ele + 1
  println(s)
  a.foreach(f=>f*2)
  println(a)
}
