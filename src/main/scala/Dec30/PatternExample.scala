package Dec30

object PatternExample extends App {

  val a=12
  def sum(x:Int): Boolean =x%2==0

  a match {
    case x if sum(a)=>println("It is divisible By 2"+ " It is the divisible value "+ x /2)
    case _=>println("It is a Default")
  }

}
