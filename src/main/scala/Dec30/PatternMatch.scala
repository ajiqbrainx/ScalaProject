package Dec30

import scala.io.StdIn
import scala.io.StdIn.readLine

object PatternMatch extends App {

  val a: Int = StdIn.readLine().toInt
  a match {
    case 2 => println("two")
    case 3 => println("three")
    case _ => println("It is default")
  }
  a match {
    case x if x % 2 == 0 => println("It is divisible By 2")
    case x if x % 3 == 0 => println("It is divisible By 3")
    case x => println("It is default")
  }
//  val b=
    a match {
    case y if y % 2 == 0 =>println( y / 2)
    case x if x % 3 == 0 => println(x / 3)
    case _ => println("It is default")
  }

  }

