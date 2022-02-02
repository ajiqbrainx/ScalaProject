package Syllabus.PatternCaseClass

import scala.util.{Failure, Success, Try}

object ApplyAndUnapply extends App {

  val optionalValue: Option[Int] = Option(23)
  val optionalValue1: Option[Int] = Option.apply(34)

  val list = List(1,2,3)
  val list1 = List.apply(1,2,3)

  val valueFromListAtIndex1: Int = list(1)
  val valueFromListAtIndex2: Int = list.apply(2)

  final class Student private (val id: Long, val fName: String, val lName: String) {

    def apply() = s"$fName $lName"
  }

  object Student {

    //    def apply(id: Long, fName: String, lName: String): Student = {
    //      if(fName.length <= 20 && lName.length <= 20)
    //        new Student(id, fName, lName)
    //      else throw new Exception("fName or lName having size greater than 20 characters")
    //    }

    def apply(id: Long, fName: String, lName: String): Try[Student] = {
      if(fName.length <= 20 && lName.length <= 20)
        Success(new Student(id, fName, lName))
      else Failure(new Exception("fName or lName having size greater than 20 characters"))
    }

    def unapply(student: Student): Option[(Long, String, String)] = Option(student).map(st => (st.id, st.fName, st.lName))
  }

  val student: Try[Student] = Student.apply(12, "Amit", "Kumar")
  val student1: Try[Student] = Student(12, "Amit", "Kumar")
  //  val student2 = new Student(34, "Amit", "Kumar")

  val studentFullName: Try[String] = student.map(_.apply())
  val student1FullName: Try[String] = student1.map(_.apply())

  val Success(Student(id, fName, lName)) = student

  val Student(id1, fNam1, lName1) = student.get

  student.get match {
    case Student(id1, fNam1, lName1) => println(id1, fNam1, lName1)
  }

  student match {
    case Success(Student(l, str, str1)) => println(l, str, str1)
  }

  println(student1FullName)
  println(studentFullName)
}