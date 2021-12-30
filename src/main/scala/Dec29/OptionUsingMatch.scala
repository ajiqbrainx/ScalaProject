package Dec29

object OptionUsingMatch extends App {

  def name(x:Option[String])={
    if(x.nonEmpty){
      x.get
    }
    else "It is not a string"
  }

println(name(Option("Ajith")))
  println(name(Option(null)))
  println(name(Option("")))
  println(name(Option("Ajith")))

}
