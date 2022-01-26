package Recursion

import scala.annotation.tailrec

object Normal extends App{
//@tailrec
  def ss(n:Int): Any ={
    if(n==0)println(n)
    else ss(n-1)
  }
ss(4)
}
