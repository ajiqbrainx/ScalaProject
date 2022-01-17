package Syllabus.Inheritance

class Multilevel {
println("Parent class")
}
class Child1 extends Multilevel{
  println("Child 1")
}
class Child2 extends Child1{
  println("Child 2")
}
object Multilevel1 extends App{
  val child2=new Child2
//  val child1=new Child1
//  val child=new Multilevel
}