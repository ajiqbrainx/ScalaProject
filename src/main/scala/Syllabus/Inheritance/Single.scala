package Syllabus.Inheritance

class Single {
  println("Single")
}

class Child extends Single {
  println("Inherits Single")
}
object Single1 extends App{
  val child=new Child
//  val single=new Single

}