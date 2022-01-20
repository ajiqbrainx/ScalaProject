package Syllabus.TraitMixing

abstract class A {
  println("Abstract class")
}

trait B {
  println("Trait B")
}

trait C {
  println("Trait C")
}

class D {
  println("Class D")
}

class Final extends A with B with C  // **=> Only you can extends with Abstract class or Normal class
 {
  println("Final")
}
object Traitmix extends App{
  val finals=new Final

}