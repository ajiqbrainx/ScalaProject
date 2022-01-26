package Test

sealed trait OptionS[T] {

  def get: T
}

//object OptionS {
//
//  def apply[T](obj : T): OptionS[T] = {
//    if (obj == null) {
//      NoneS
//    } else {
//      SomeS(obj)
//    }
//  }
//}
//
//final case class SomeS[T](value: T) extends OptionS[T] {
//  override def get: T = value
//}
//
//case object NoneS extends OptionS[Nothing] {
//  override def get: Nothing = throw new Exception("Not found")
//}
//
//val a = OptionS(2323)
//
//a match {
//  case x: SomeS[Int] =>
//  case NoneS =>
//}
//}