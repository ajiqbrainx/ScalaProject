package Dec30

object TryMatch1 extends App {

  def ss(x: Option[Int]) = {
    x match {
      case Some(value) => value
      case None => "None"
    }
  }

  println(ss(Some(23)))
  println(ss(None))


  def jj(s: String): Either[String, Any] =
    s match {
      case x if (x.isEmpty) => {
        Left("iou")
      }
      case x => Right(s.toDouble)
    }

  println(jj("1230000"))

  //
  //  def try1(a:String)
}
