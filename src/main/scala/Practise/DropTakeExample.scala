package Practise

object DropTakeExample extends App {

  def takeDrop(a: String, b: Int) = {
//    a.take(b) +
      a.drop(b + 1)
  }

  println(takeDrop("AJith", 5))

  //  val number1=3
  //  val string1="Ajith".take(number1) + .drop(number1+1)
  //  println(string1)
}
