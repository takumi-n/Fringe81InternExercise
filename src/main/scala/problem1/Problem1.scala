package problem1

/**
  * Created by takumi on 2017/07/21.
  */
object Problem1 extends App {
  def show(value: Option[String]): Unit = value.foreach(println(_))

  show(Some("hello"))
  show(None)
}
