package Dec30

object OptionMatch extends App {

  val a = Option(0)

  a match {
    case Some(1) => println("One")
    case Some(2) => println("Two")
    case None => println("None")
    case _ => println("NO number Avilable")
    case Some(value) => println(value)
    case None => println("None")
  }

}
