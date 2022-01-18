package Syllabus.Trait

trait TraitMultiple {
  def name // Abstract method
}

trait MultipleTrait1 {
  def age(Age: Int) = println("My Age is "+Age) //Non Abstract Method
}

class Example1 extends TraitMultiple with MultipleTrait1  // Add multiple trait use "with" Keyword
{

  def name = println("My name is Ajith")
}

object MultipleTraitEx extends App {
  val example = new Example1
  example.name
  example.age(23)

  // Override to create an Trait
  val multipleTrait=new TraitMultiple {
    override def name: Unit = println("Ashok")
  }
  multipleTrait.name
}