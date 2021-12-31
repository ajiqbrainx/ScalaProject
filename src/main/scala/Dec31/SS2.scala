package Dec31

object SS2 extends App {
  sealed trait Section

  case object A extends Section

  case object B extends Section

  case object C extends Section



  case class Student(name: String, section: Section)



  val student = Student("Hello", A)



  student match {

    case Student(name, A) => println(name)

    case Student("Arun", B) => println("Hello A")

    case x @ Student(_, B) =>

      println(x)

      println("Hello from section B")

    case student : Student => println(student.section)

  }


}
