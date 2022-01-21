package Syllabus.Collection

//import Syllabus.Collection.PrimeNumber.PrimeExample2.checkPrime

import scala.util.control.Breaks.break

object PrimeNumber extends App {
  checkPrime(1)
  checkPrime(3)
  checkPrime(17)
  checkPrime(20)

  def checkPrime(n: Int): Unit = {
    var i = 0
    var m = 0
    var flag = 0
    m = n / 2
    if (n == 0 || n == 1) System.out.println(n + " is not prime number")
    else {
      i = 2
      while ( {
        i <= m
      }) {
        if (n % i == 0) {
          System.out.println(n + " is not prime number")
          flag = 1
                    break //todo: break is not supported

        }

        i += 1
      }
      if (flag == 0) System.out.println(n + " is prime number")
      //end of else  }
    }


  }


}