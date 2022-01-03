package Jan03

object Group extends App {

  def bool(a: Int)(b: Int): Boolean = a == b

  println(bool(1)(1))
  println(bool(1)(5))
}
