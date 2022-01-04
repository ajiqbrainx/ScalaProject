package Practise.ArrayExample

object TwoArraycheck extends App {

  def twocheck(x:Array[Int],y:Array[Int]):Boolean={
    if(x.head==y.head || x.last==y.last)true
    else false
  }
val x=Array(1,23,32,3,1)
  val y=Array(0,233,9,43,34,9)
  println(twocheck(x,y))
}
