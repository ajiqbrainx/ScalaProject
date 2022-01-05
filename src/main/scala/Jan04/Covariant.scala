package Jan04


object Covariant extends App {

  trait A{
    println("A")
  }

  trait A1 extends A{
    println("A1")
  }

  trait A2 extends A{
    println("A2")
  }

  class B[T](val name: T)

  val a: A = new A {}
  val a1: A1 = new A1 {}
  val a2: A2 =new A2 {}


  val b: B[A] =new B(a)
  val b1: B[A1] =new B(a1)
  val b2: B[A2] =new B(a2)


  def covarint(b:B[A])={
    println(b.name.toString)
  }
  println(b)
  println(b1)
  println(b2)
}