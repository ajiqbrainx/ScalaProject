package Syllabus.CaseClass

case class CaseEx(name: String, age: Int)

object CaseEx1 extends App {

  val caseEx = CaseEx("Ajith", 23)
  val caseEx1=CaseEx("Ashok",24)
  val caseEx2=CaseEx("Abi",25)

  for(i<- List(caseEx,caseEx1,caseEx2)){

    i match {

      case CaseEx(name,age)=>println(s"Your name is = $name  And your age is = $age")
    }
  }

}
