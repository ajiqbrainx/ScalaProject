package Test

object OptionEx extends App {

//  def check(name: String) = {
//    if (name.isEmpty) None
//    else Some(name)
//  }

//  println(check("Ajith"))
//  println(check(""))

def check(name:Option[String])={
  name match {
    case Some(value)=>println(value)
    case None=>println("NO name")
  }
}
  check(Option("Ajith"))
  check(Option(null))

  val name= Option("Ajith")
  name match {
    case Some(value) => println(value)
    case None => println("No name")
  }
}
