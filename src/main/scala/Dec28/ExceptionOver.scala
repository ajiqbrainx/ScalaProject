package Dec28

object ExceptionOver extends App{

  def option(a:Option[String])={
    if (a.nonEmpty){
      a.get
    }
    else 0
  }
  println(option(Option.apply("Ajith")))
  println(option(None))
  println(option(Some("Ajith AShok")))
  println(option(Option("")))
  println(option(Option(null)))
}
