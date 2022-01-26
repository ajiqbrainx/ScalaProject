package AAAAA

import AAAAA.GenericHigher.add


object Generic extends App {

  class Ajith[A, B] {

    // Generic Using Val

    // Using List
    val a: List[A] = Nil
    val add = a :+ "Ajith" :+ "Ashok"
    val addlist = add :+ List(1, 2, 3, 4, 5)
    val b: List[B] = Nil
    val add1 = b :+ 1 :+ 2

    // Generic Using Def

    def name[A, B](Name: A, Age: B): Unit = {
      println("Your Name is = " + Name)
      println("Your Age is = " + Age)
    }


  }

  val ajith = new Ajith
  println(ajith.add.head)
  println(ajith.add1.head)
  println(ajith.add)
  println(ajith.addlist)
  ajith.name("Ajith", 23)

}
