package Jan10

object PatternMatch extends App {

  val a = 8
  a match {
    case 1 | 3 | 5 | 7 => println("It is odd")
    case 2 | 4 | 6 | 8 => println("It is even")
  }

}
