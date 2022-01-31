package AAAAA

import scala.annotation.tailrec






object Array1 extends App {


  val a = Array("Ajith", "Abi", "Aji", "Ash","Akil")

  println(a(0))

  @tailrec
  def indexArray[T](a:Array[T], Index:Int): Any ={
    if(a(Index)==3){
      Index
    }
    else indexArray(a,Index+1)
  }
//println(indexArray(a,0))
//  println(indexArray(Array("Ajiht","Akil"),0))
  println(indexArray(Array(1,2,3,4,5),0))

}
