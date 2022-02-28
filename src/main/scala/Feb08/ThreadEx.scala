package Feb08

object ThreadEx extends App {

  //  val runnable: Thread =new Thread(new Runnable {
  //    override def run(): Unit = println("Im running")
  //  })
  //  val a = for {
  //    cc <- Array(1, 2, 3)
  //    aa <- List(1, 2, 3, 4)
  //  } yield println(cc + aa)

  //  val function = new Function1[Int, Int] {
  //    override def apply(v1: Int): Int = v1 + 1
  //  }
  //  println(function.apply(23))
  //  println(function(23))

  def apply(x: Int, y: Int, fun: Function1[Int, Int]): Int = fun(x + y)

  println(apply(1, 2, f => f))

  val fun = new Function2[Int, Int, Int] {
    override def apply(v1: Int, v2: Int): Int = v1 + v2
  }
//  println(fun(11, 2))
//  fun.apply(12,34)
//  fun.apply(234,5)
//  fun(34,3)


  // I want to print this (1,2,3) to (a-1,b-2,c-3)
  val list=List(1,2,3).map(number=>List("a","b","c").map(letter=>s"$number-$letter"))
println(list)
}
