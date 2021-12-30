package Practise

object Ngreatervalues extends App {
    def test(x:Int) : Int =
    {
      val a = Math.abs(x - 51)
      //abs Method is used to absolute value of the specifed number
      if (x > 51) 3 * a
      else a

    }
      println("Result: " + test(60));
      println("Result: " + test(40));


}
