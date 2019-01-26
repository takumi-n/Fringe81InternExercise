package problem2

/**
  * Created by takumi on 2017/07/21.
  */
object Problem2 extends App {
  def getFirst(value: Option[String]): String = value match {
    case Some(x) if x.length > 0 => x.substring(0, 1)
    case _ => ""
  }

  def getFirstWithoutPatternMatching(value: Option[String]): String = {
    val v = value.getOrElse("")
    if (v.length == 0) v
    else v.substring(0, 1)
  }

  println(getFirst(Some("hello")))
  println(getFirst(Some("")))
  println(getFirst(None))

  println(getFirstWithoutPatternMatching(Some("hello")))
  println(getFirstWithoutPatternMatching(Some("")))
  println(getFirstWithoutPatternMatching(None))
}
