package Syllabus.PartialFunction

import Syllabus.PartialFunction.Collect.partialFunction

object CollectFor extends App{

var r=0
  for (i <- 1 to 100){

  }


  val partialFunction111:PartialFunction[Int,Int]={

    case x if x%2==0 => (x)
    case y if y%3==0 =>  (y)
    case z if z%5==0 => (z)
    case _=>0
  }
  val result=List(1,2,3,4,5,6,7,8,9,10,11,12).collect(partialFunction111)
  println(result)

}

