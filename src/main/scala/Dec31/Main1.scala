package Dec31


object Main1 extends App {

  val a: PartialFunction[Int, Int] = {

    case x if x % 2 == 0 => 10 * x

      
  }


  val r: PartialFunction[Int, Int] = {

    case x if x != 0 => 10 * x

  }


  val res = a andThen r

  println(res(10))


}
