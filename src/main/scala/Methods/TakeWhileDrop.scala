package Methods

object TakeWhileDrop extends App {

  val list = List(1, 2, 8, 3, 4, 5, 6, 7, 232, 234, 8)
  println("*****Take While ****")
  println(list.takeWhile(_ < 5))
  // If the condition is true then only executed and
  // once its not satisfied the condition it wont executed.
  val list1 = List(6, 7, 8, 9, 12, 1, 9)
  println(list1.takeWhile(_ > 5))
  //The given list1 is 9 is also greater than 5 and its doesn't  print.
  //why it because 12 after the 1 it here so condition is false that's only reason.
  val list2 = List(1, 2, 3, 4, 5, 6, 7, 8)
  println(list2.takeWhile(_ > 5))
  //  The given list2 in 5 Is greater than available
  //  so the condition is firstly wrong that's why its not taking value.
  println("******TAKE*****")
  println(list)
  println(list.take(3))
  //It is takes number of elements
  println("*******Drop******")
  println(list)
  println(list.drop(3))
  //Drop is opposite to take => It drop the element
println("*******Take Right*******")
  println(list)
  println(list.takeRight(4))
//  Take right is working on Right to we are taking values
  println("*******Take Left*******Nothing in scala" +
    "")
  println(list)


}
