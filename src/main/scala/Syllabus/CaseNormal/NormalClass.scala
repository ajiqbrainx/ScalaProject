package Syllabus.CaseNormal

class NormalClasss(val name: String, val age: Int) {
  override def toString: String = s"Your name is $name and your age is $age "
}

case class Caseclass(Name: String, Age: Int)

object NormalClass1 extends App {
  val normalClass = new NormalClasss("Ajith", 23)
  println(normalClass) // normal class we can't Access
//  println(normalClass.name)
//  println(normalClass.age)
  val caseclass = Caseclass("Ajith", 23)
  println(caseclass) // Case class we can Access
}