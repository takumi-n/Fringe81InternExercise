package problem5

import scala.collection.mutable

/**
  * Created by takumi on 2017/07/21.
  */
object Problem5 extends App {
  private val scores = Map(
    "ichiro" -> Map("math" -> 82, "english" -> 99),
    "jiro" -> Map("japanese" -> 100, "social" -> 88),
    "saburo" -> Map("math" -> 76, "english" -> 80),
    "shiro" -> Map("math" -> 99, "social" -> 81),
    "hanako" -> Map("math" -> 84, "english" -> 78, "social" -> 66))

  def passStudents(scores: Map[String, Map[String, Int]]): Map[String, Int] = scores flatMap { case (name, score) =>
    val average = for {
      e <- score.get("english")
      m <- score.get("math")
    } yield (e + m) / 2

    average map {
      (name, _)
    }
  } filter { case (_, ave) => ave > 80
  }

  println(passStudents(scores))
}
