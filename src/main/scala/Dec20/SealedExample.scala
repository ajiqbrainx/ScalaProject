package Dec20

sealed trait SealedExample {

  def print(): Unit
}
 final  class Sealed1 extends SealedExample{
  override def print(): Unit = println("Ajith")
}
final class Sealed2 extends SealedExample {
  override def print(): Unit = println("Ashok")
}

