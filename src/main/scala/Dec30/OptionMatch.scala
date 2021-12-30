package Dec30

object OptionMatch extends App {

  val a=Option(2)

  a match {
    case Some(1)=>println("One")
    case Some(2) =>println("Two")
    case None => println("None")
  }

}
