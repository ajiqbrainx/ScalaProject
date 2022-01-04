package Jan04

trait TraitMixing {
def sum(a:Int,b:Int):Int
  def add(a:Int):Int=sum(a,9)
}
class ss
trait TraitMixing1{
  x:TraitMixing=>
  override def sum(a: Int, b: Int): Int = {
    println("Overide")
    a+b
  }
}
class Trait1 extends TraitMixing with TraitMixing1 {
  override def sum(a: Int, b: Int): Int = {
    println("Overide")
    a+b
  }
}
class Trait2 extends TraitMixing1 with TraitMixing {
  override def sum(a: Int, b: Int): Int = super.sum(a, b)
}
object Main extends App{
  val trait1:TraitMixing=new Trait1
//  val trait2:TraitMixing=new TraitMixing1 {}
  println(trait1.add(12))

  def add(a:Int)(b:Int)(c:Int):Int=a+b+c

  val a1: Int => Int => Int =add(1)
  val a2: (Int, Int) => Int =add(1)(_)(_)
}