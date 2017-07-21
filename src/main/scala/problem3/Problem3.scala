package problem3

/**
  * Created by takumi on 2017/07/21.
  */
object Problem3 extends App {
  private val dictionary = Map(1 -> "one", 2 -> "two")

  def translate(num: Option[Int]): Option[String] = num.flatMap(dictionary.get)

  println(translate(Some(1)))
  println(translate(Some(3)))
  println(translate(None))
}
