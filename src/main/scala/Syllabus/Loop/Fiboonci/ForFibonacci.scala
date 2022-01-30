package Syllabus.Loop.Fiboonci

object ForFibonacci extends App {

  var pre = 0
  var cur = 1
  val n = 8
  var add = 0
  for (i <- 1 to n) {

    add = pre + cur
    pre = cur
    cur = add
  }
  println(pre)
}
