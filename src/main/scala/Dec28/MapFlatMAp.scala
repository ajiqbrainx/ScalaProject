package Dec28

import scala.util.Try

object MapFlatMAp extends App {

//  val input="189"
//  val ss=Try(input.toInt)
//println(ss.get)
//
  val ll=List(1,2,3,4,5).map(f=>List(f,f))
  println(ll)
  val ll1=List(1,2,3,4,5).flatMap(f=>List(f,f))
println(ll1)
  val ll3=ll1.map(f=>List(f,f))
  println(ll3)
  val ll2=ll3.flatten
println(ll2)
  val ss1 =List("Ajith","AShok","Aji").flatMap(f=>List(f,f))
println(ss1.flatten)

}
