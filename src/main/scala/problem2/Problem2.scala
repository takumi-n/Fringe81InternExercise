package problem2

/**
  * Created by takumi on 2017/07/21.
  */
object Problem2 extends App {
  def getFirst(value: Option[String]): String = value match {
    case Some("") | None => ""
    case Some(x) => x.substring(0, 1)
  }

  println(getFirst(Some("hello")))
  println(getFirst(Some("")))
  println(getFirst(None))
}
