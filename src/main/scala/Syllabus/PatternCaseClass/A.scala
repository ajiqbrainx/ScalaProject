package Syllabus.PatternCaseClass

sealed trait A

case class Child1(name: String, age: Int) extends A

case class Child2(name: String, age: Int) extends A

case class Child3(name: String, age: Int) extends A


object Main extends App {

  val child1 = Child1("Ajiht", 12)
  val child2 = Child2("Ashok", 24)
  val child3 = Child3("Aji", 25)

  def check(a: A): Unit = {
    a match {
      case Child1(name, age) => println(s"Child1 Your name is = $name And your is age is = $age")
      case Child2(name, age) => println(s"Child2 Your name is = $name And your is age is = $age")
      case Child3(name, age) => println(s"Child3 Your name is = $name And your is age is = $age")
    }
  }

  check(child1)
  check(child2)
  check(child3)
  check(  Child3("Abi",34))

}