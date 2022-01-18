package AAAAA

object Unapply1 extends App {

  def apply(name: String, suffix: String) = name + "." + suffix

  def unapply(name: String): Option[(String, String)] = {
    //simple argument extractor
    val parts = name.split("\\.")
    if (parts.length == 2) Some(parts(0), parts(1)) else None
  }
  println(unapply("AjithJagan"))
}
