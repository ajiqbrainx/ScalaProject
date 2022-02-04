package PractiseWork

object ArraySize extends App {

  val array = Array("Ajith", "Ashok", "Abi", "Aji", "Abi1", "Akilan")

  val b = array.length
  var index = 0

  for (i <- 1 to b) {
    if (array(index).length >= 5) {
      println(array(index))
    }
    index = index + 1
  }

}
