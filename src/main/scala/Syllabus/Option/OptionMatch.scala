package Syllabus.Option

object OptionMatch extends App {
  val a = Map(1 -> "Ajith", 2 -> "Ashok")

  def show(name: Option[String]) = name match {
    case Some(value) => value
    case None => "No value"
  }
  println(show(Some("Ajith")))
  println(show(None))
  //  println(show(null))
  println(show(a.get(2)))
}
