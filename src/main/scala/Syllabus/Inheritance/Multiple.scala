package Syllabus.Inheritance

trait Multiple {
println("Parent")
}
abstract class A{
  println("A")
}
trait Trait1{
  println("Child 1")
}
trait Trait2{
  println("Child 2")
}
class Combine extends A with Multiple with Trait1 with Trait2 {
  println("Child 3")
}
object Combine1 extends App{
  val combine=new Combine
}