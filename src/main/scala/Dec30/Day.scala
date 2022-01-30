package Dec30

sealed trait Animal

case object Dog extends Animal
case object Cat extends Animal
case object Lion extends Animal
case object Tiger extends Animal
case object Cheetah extends Animal
object Monkey extends Animal

object Main extends App{

  def wildAnimal(animal: Animal)=animal match {
    case Cat =>false
    case Dog => false
    case Cheetah => true
    case Lion => true
    case Monkey => false
//    case _=>"It is not animal"
  }
  println(wildAnimal(Cat))
  println(wildAnimal(Dog))
  println(wildAnimal(Lion))
  println(wildAnimal(Cheetah))
}