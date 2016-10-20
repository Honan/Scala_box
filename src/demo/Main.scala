package demo
import scala.io.StdIn.{readInt}
object Main {
  def main(args:Array[String]) :Unit = {

    val Box1 = new Box()


    print("Введите ширину ")
    Box1.width = readInt
    print("Введите высоту ")
    Box1.height = readInt
    print("Введите длину ")
    Box1.depth = readInt

    val volume = Box1.width * Box1.height * Box1.depth

    if(volume > 1000) println("Коробка большая ее объем равен " + volume) else  println("Коробка маленькая ее объем равен " + volume)

  }
}
