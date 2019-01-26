package problem3

/**
  * Created by takumi on 2017/07/21.
  */
object Problem3 extends App {
  private val dictionary = Map(1 -> "one", 2 -> "two")

  def translate(num: Option[Int]): Option[String] = num flatMap { dictionary.get }

  def translate1(num: Option[Int]): Option[String] = dictionary.get(num.getOrElse(-1)) // Bad

  def translate2(num: Option[Int]): Option[String] = num match {
    case Some(x) => dictionary.get(x)
    case _ => None
  }

  def translate3(num: Option[Int]): Option[String] = (for {n <- num} yield dictionary.get(n)).flatten

  println(translate(Some(1)))
  println(translate(Some(3)))
  println(translate(None))

  println(translate1(Some(1)))
  println(translate1(Some(3)))
  println(translate1(None))

  println(translate2(Some(1)))
  println(translate2(Some(3)))
  println(translate2(None))

  println(translate3(Some(1)))
  println(translate3(Some(3)))
  println(translate3(None))
}
