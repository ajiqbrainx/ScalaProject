package Dec27

object ForeachExample extends App {

  val ss = List(1, 2, 3, 4, 5, 6, 7).filter(f => f % 2 == 0)
  val jj = List(1, 2, 3, 33, 34, 5, 7, 5).foreach(f =>println( f +"Ajith"))

    println(ss)
//  println(jj)
}