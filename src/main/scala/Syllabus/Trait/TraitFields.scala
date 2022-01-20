package Syllabus.Trait

trait TraitFields {
  val name: String // Abstract Fields
  val age = 23 // Concrete Fields
}

class MyClass extends TraitFields {
  //I'm override to my abstract fields
  override val name: String = "Ajith"

  def show(): Unit = {
    println("My Name is " + name)
    println("My Age is  " + age)
  }
}

object TraitFields1 extends App {
  val myClass = new MyClass
  myClass.show()
}