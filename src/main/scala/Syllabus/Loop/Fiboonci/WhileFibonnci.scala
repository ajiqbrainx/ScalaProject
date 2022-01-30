package Syllabus.Loop.Fiboonci

object WhileFibonnci extends App {

  var pre = 0
  var cur = 1
  val n = 7
  var i = 0
  while (i < n) {
    val add = pre + cur
    pre = cur
    cur = add
    i = i + 1

  }

  println(pre)



}
