package Test

object Option1 extends App {


  val name = Option("Ajith")
  val age = Some("Ajith")
//  println(name)
//  println(age)

  def ass(name: Option[String]) = {
    name match {
      case Some(value) => value
      case None => "no Name"
    }
  }

//  println(ass(Some("Ajith")))
//  println(ass(None))
//  println(ass(Some("")))


  val name1: PartialFunction[Option[String], String] = {
    case Some(name) => name
    case None => "No name"
  }

  println(name1(Option("Ajith")))
  println(name1(Some("Ashok")))
  println(name1(None))
}