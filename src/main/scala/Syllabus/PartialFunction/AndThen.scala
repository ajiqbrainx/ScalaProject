package Syllabus.PartialFunction

object AndThen extends App {

  val ss: PartialFunction[Int, Int] = {

    case x if x % 2 == 0 => x + x
  }
  val bb = (x: Int) => x + x

  val cc = ss andThen (bb)
  val dd =bb andThen (ss)

  println(cc(3))
  println(dd(3))
}
