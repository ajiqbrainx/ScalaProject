package Syllabus.Collection

import scala.+:
import scala.collection.mutable.{ArrayBuffer, ListBuffer}

object List1 extends App {

  val array = ArrayBuffer(1, 2, 3, 4, 5, 6)
  val array1 = Array(1, 2, 3, 4, 5)
  val list = List(1, 2, 3, 4, 5)
  val aa=6+: list
  println(aa)

  val list2=ListBuffer(1,2,3,4,5,6)

  val bb=list2 +=55
  println(bb)
  //    val a = array += 6
  val b = array -= 6
  //  val a1 = array1 -= 5
  //  array1() -= 2
  //  array1(1) = 10
  println(array1)
  for (a <- array1) {
    println(a)
  }
  println(b)


  val set = Set(1, 2, 3, 4, 44, 6, 6, 6)
  println(set)
  val s=set
//  val ss=

}
