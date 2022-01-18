package Syllabus.Others

sealed trait Sealed {
  val Name: String
}

class A extends Sealed {
  override val Name: String = "Ajith"
}

class B extends Sealed {
  override val Name: String = "Ashok"
}

object SealedEx extends App {
  val a = new A
  val b = new B

  println(check(a))
  println(check(b))

  def check(name: Sealed) = name match {

    case a => a.Name
    case b => b.Name
  }


}