package Jan05

object ListAndExample extends App {

  val list1 = List(1, 2, 3, 4, 5)
  println(list1)
  val list2 = List(6, 7, 8, 9, 10)
  println(list2)
  println("********Add List*******")
  val addlist = list1 ::: list2
  println(addlist)
  println(list1 ++ list2)
  println("*********Fill***********")
  val fillelement = List.fill(5)("Aji")
  println(fillelement)
  val fillelement1 = List.fill(5)(5)
  println(fillelement1)
  println("*********Tabualate list***********")
  val tabulate = List.tabulate(5)(f => f * f) //Its takes Index 0 then if you want anything you can implement
  println(tabulate)
println("*************Empty List************")
val emptylist =List()
  println(emptylist.isEmpty)
}
