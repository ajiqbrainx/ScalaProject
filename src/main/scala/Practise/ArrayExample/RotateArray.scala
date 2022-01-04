package Practise.ArrayExample

object RotateArray extends App{
  var x1=Array(1,213,232432,443,34,435,4543)
  for(x<-x1){
    print(x +",")
  }
  def rotate(x:Array[Int])={
    if(x.length<1)false
    x.tail :+ x.head
  }
  println()
  val ee=rotate(x1)
  for (x<-x1){
    print(x+",")
  }


println()

  def rotate_left(arr: Array[Int]): Array[Int] = {
    if (arr.length < 1) false
    arr.tail :+ arr.head
  }
  val nums1 = Array(1,2,3,4,5,6,7)
  for ( x <- nums1 ) {
    print(s"${x}, ")
  }
  println("\nRotate left one element:")
  var result_left1 = rotate_left(nums1)
  for ( x <- result_left1 ) {
    print(s"${x}, ")
  }








}
