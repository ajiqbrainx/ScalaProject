package Practise.ArrayExample

object RotateArray extends App {

  def rotate_left(arr: Array[Int]) = {
    if (arr.length < 1) false
    arr.tail :+ arr.head
  }

  val nums1 = Array(1, 2, 3, 4, 5, 6, 7)
  for (x <- nums1) {
    print(s"${x}, ")
  }
  println()
  println("Rotate left one element:")
  var result_left1 = rotate_left(nums1)
  for (x <- result_left1) {
    print(s"${x}, ")
  }


}
