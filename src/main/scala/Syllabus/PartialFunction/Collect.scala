package Syllabus.PartialFunction

object Collect extends App {

  val partialFunction:PartialFunction[Int,Int]={
    case x if x%3 ==0 => x

  }
//Collect method is use to constructing a new  collection
  val result=List(1,2,3,4,5,6,7,8,9,10,11,12).collect(partialFunction)
  println(result)
}
