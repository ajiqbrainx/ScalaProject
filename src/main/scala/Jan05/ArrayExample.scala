package Jan05

object ArrayExample extends App{
  val array=Array(1,2,3,4,5)
  val arrayvalue: Array[Int] =new Array[Int](5)
println(arrayvalue.length)
  val array2d: Array[Array[Int]] =Array.ofDim[Int](2,3)
  println(array2d.length)
}
