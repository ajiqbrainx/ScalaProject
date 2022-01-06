package Jan06

object MethodsInScala extends App {

  val list = List(1, 2, 3, 4, 5)
  val flat = list
  val listoflist = List(List(1, 2), List(3, 4))
  println(list)
  println(listoflist)
  //  println(list)
  println(listoflist.flatten)

  val find: Option[Int] = list.find(_ == 9)
  println(find.getOrElse(5))
  println(list.slice(0, 2))

  println("******FoldLeft and FoldRight*******")

  val list1 = List(1, 2, 3, 4, 5, 6, 7)
  val left = list1.foldLeft(0)((x, y) => x - y)
  println(left)
  val right = list1.foldRight(0)((x, y) => x - y)
  println(right)


  println("******List of tuple*****")
  val tuple = List((1, "Ajijt"),(2, "Ashok"), (3, "Abi"))
  val tuple11 = tuple.toMap
  println(tuple11)

  println("*******Sorted*******")

  val list0=List(4,6,5,2,1,0)
 list0.sorted.foreach(println)
//  println(list0.sorted)
//  val para=list0.permutations.toList
//  para.foreach(println)
//  println(para)

  println("********Exits and ForAll and Count*******")
  val aa=List(1,2,3,4,5,5,5,6,7,8)
  println(aa.exists(_==5))
  println(aa.forall(_<1))
  println(aa.count(_==5))
  println("**********Zip with Index********")
  val bb=List(1,2,43,54,66,4,3)
//  println(bb.zipWithIndex(.))
}
