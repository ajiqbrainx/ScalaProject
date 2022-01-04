package Jan03



import spray.json._
import spray.json.DefaultJsonProtocol._

//import ImplicitsScala._

object ScalaMain5 extends App {

  case class Student (name: String, mobileNumber: Option[String])

  val student = Student("Hello", Some("+911234567890"))
implicit val cal: RootJsonFormat[Student] =jsonFormat2(Student)
  println(student.productElementName(0))

  val jsonString: String = student.toJson.prettyPrint

  println(jsonString)

//  class StudentNormalClass(val name: String, val mobile: Option[String])
//
//  val a= new StudentNormalClass("saasas", None).toJson.prettyPrint
//
//  println(a)


}
