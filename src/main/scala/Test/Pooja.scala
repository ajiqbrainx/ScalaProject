package Test

object Pooja extends App {

  case class Pooja(name: String, age: Int)

  val pooja = Pooja("Ajith", 23)
  val pooja1 = Pooja("Ajith", 23)

  println(pooja1.equals(pooja))


  class God(val name: String, val age: Int) {
    override def equals(obj: Any): Boolean = {
      if (obj == null)
        false

      else if (!obj.isInstanceOf[God])
        false

      else {
        val temp: God = obj.asInstanceOf[God]
        this.name == temp.name & this.age == temp.age
      }
    }
  }

  val god =new God("Messi",34)
  val god1 =new God("Messi",34)

  println(god.equals(god1))






}
