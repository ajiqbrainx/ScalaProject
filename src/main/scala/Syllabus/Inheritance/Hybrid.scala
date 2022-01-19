package Syllabus.Inheritance

class Hybrid {
println("Parent ")
}
class B extends Hybrid

class Child11 extends Hybrid{
  println("Child 1")
}
class Child22 extends Child11{
  println("Child 2")
}
object Hybrid1 extends App{
  val child2=new Child22
val child11=new Child11
}


