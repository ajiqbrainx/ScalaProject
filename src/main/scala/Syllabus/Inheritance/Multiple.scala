package Syllabus.Inheritance

trait Multiple {
println("Parent")
}
trait Trait1{
  println("Child 1")
}
trait Trait2{
  println("Child 2")
}
class Combine extends Multiple with Trait1 with Trait2
object Combine1 extends App{
  val combine=new Combine
}