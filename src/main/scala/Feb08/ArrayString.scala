package Feb08

object ArrayString extends App {

  val array = Array("Ajith", "Aji")

  val length = array.length
  var index = 0
  for (i <- 1 to length) {
    if (array(index).length >= 5) println(array(index))
    index += 1
  }


}
