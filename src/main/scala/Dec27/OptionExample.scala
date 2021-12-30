package Dec27

object OptionExample extends App {
  def optionex(option:Option[String])={
    if(option.nonEmpty)option.get
    else 0
  }
//  val list=List()
//  val stringnumber: Option[String] =Option.apply("aji")
//  val integernumber = Option(stringnumber.map(f=>f.length-f))
//  println(integernumber)
  println("!!!!!!!!!!!!!!!!!!!!")

println(optionex(Option.apply("aaaaa")))
  println(optionex(Option.apply(null)))
  println(optionex(Some.apply("Ajith")))
  println(optionex(Some("Abiiiiiiii")))
  println(optionex(None))




}
