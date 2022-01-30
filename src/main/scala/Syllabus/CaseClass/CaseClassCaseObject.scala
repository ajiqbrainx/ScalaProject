package Syllabus.CaseClass

trait CaseClassCaseObject

case class A(name: String, age: Int) extends CaseClassCaseObject

case class B(number: Int, place: String) extends CaseClassCaseObject

case object C extends CaseClassCaseObject

object Main extends App{

  def working(s:CaseClassCaseObject)={
    s match {
      case A(name,age)=>println(s"$name $age")
      case B(number, place)=>println(s"$number $place")
      case C=>println("Object")
    }
  }

  working(A("Ajith",23))
  working(B(5,"Salme"))
  working(C)
}
