package AAAAA

object Class extends App {


  val a: PartialFunction[Int, Int] = {
    case x if x == 0 => x + x
    case _ => 0
  }
//  val b:PartialFunction[Int,Int]={
//
//  }
  println(a(2))
}
