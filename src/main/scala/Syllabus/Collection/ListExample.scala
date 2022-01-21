package Syllabus.Collection

import scala.io.StdIn

object ListExample extends App {

  val value = 1 to 15
  val s = value.toList
  println(s)
  //  val mul2: PartialFunction[Int, Int] = {
  //    case x if x % 2 == 0 => x
  //  }
  //  println(s.collect(mul2))
  //  val mul3: PartialFunction[Int, Int] = {
  //    case x if x % 3 == 0 => x
  //  }
  //  println(s.collect(mul3))
  //  val mul5: PartialFunction[Int, Int] = {
  //    case x if x % 5 == 0 => x
  //  }
  //  println(s.collect(mul5))

  println("*******Filter ******")
  println(s)
  val div2 = s.filter(f => f % 2  == 0).filter(f => f % 3 == 0).filter(f => f % 5 == 0)
  println(div2)
//  val div3 = s.filter(f => f % 3 == 0)
//  println(div3)
//  val div5 = s.filter(f => f % 5 == 0)
//  println(div5)










//  for (aa <- s) {
//    if (aa % 2 == 0) println(aa)
//    else if (aa % 3 == 0) println(aa+"Divide By 3")
//    else if (aa % 5 == 0) println(aa+"Divide By 5")
//    else println(aa+"It is Default")
//  }



}
