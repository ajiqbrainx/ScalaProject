package Syllabus

trait TraitMehods {
  def abstractMethod // This is Abstract method

  def nonAbstract(a: Int, b: Int): Int = a + b // This is Non-Abstract Method
  // We no need to Implement To Any where
  //why it because its already Implemented
}

class Example extends TraitMehods {
  def abstractMethod: Unit = println("This is extending trait ")

}

object Main1 extends App {
  val example = new Example
  example.abstractMethod
    println(example.nonAbstract(2,3))

}