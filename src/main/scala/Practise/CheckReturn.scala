package Practise

object CheckReturn extends App {

    def test(x:Int) : Boolean  =
    {
      Math.abs(100-x) <= 20 || Math.abs(300 - x) <= 20
      //abs = In method returns the absolute value (positive value) of the specified number
    }

      println("Result: " + test(101))
      println("Result: " + test(300))
      println("Result: " + test(121))
      println("Result: " + test(70))



}