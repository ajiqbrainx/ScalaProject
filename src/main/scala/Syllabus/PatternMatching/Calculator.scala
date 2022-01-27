package Syllabus.PatternMatching

import scala.io.StdIn


object Calculator extends App {

    def calc(Type: String, a: Int, b: Int) = {

      Type match {
        case "+" => a + b
        case "-" => a - b
        case "*" => a * b
        case "/" => a / b
        case _ => "You do noting"
      }
    }

  //Dynamic Get data

  println("Add to value => " + "+")
  println("Sub to value => " + "-")
  println("Mul to value => " + "*")
  println("Div to value => " + "/")

  println("Enter the Your Need")
  val Type = StdIn.readLine()
  println("Enter the First Number")
  val a = StdIn.readLine().toInt
  println("Enter the Second Number")
  val b = StdIn.readLine().toInt

  Type match {
    case "+" => println(" Addition value is = " + (a + b))
    case "-" => println(" Subtraction value is = " + (a - b))
    case "*" => println(" Multiplication value is = " + (a * b))
    case "/" => println(" Division value is = " + (a / b))
    case _ => println("You do nothing")
  }

}
