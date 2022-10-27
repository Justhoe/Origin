import kotlin.math.pow

fun main() {
  println("Что нужно сделать:")
  println("1.Найти периметр квадрата")
  println("2.Найти площадь квадрата")
  println("3.Найти площадь прямоугольника и его периметр")
  println("4.Найти объём куба")
  println("5.Поменять местами содержимое переменных")
  println("6.Найти значение функции")
  val a = readLine()!!.toInt()
  if (a==1){
    println("введите сторону квадрата")
    val b = readLine()!!.toInt()
    val p = b*4
    println("Периметр = $p")
  }
  if (a==2){
    println("Введите сторону квадрата")
    val b = readLine()!!.toDouble()
    val s = b.pow(2)
    println("Площадь = $s")
  }
  if (a==3){
    println("Введите стороны прямоугольника")
    val b = readLine()!!.toInt()
    val d = readLine()!!.toInt()
    val s = b*d
    val p = 2*(b+d)
    println("Площадь = $s");println("Периметр = $p")
  }
  if (a==4){
    println("Введите длинну ребра куба")
    val b = readLine()!!.toDouble()
    val v = b.pow(3)
    val s = (6*b).pow(2)
    println("Объём = $v");println("Площадь = $s")
  }
  if (a==5){
    println("Введите 2 переменные")
    var b = readLine()!!.toInt()
    var d = readLine()!!.toInt()
    b*=d
    d*=b
    println("Новые значение:$b,$d")
  }
  if(a==6){
    println("Введите значение x")
    val x = readLine()!!.toDouble()
    val y = (3*x).pow(6)-(6*x).pow(2)-7
    println("Знаячение функции = $y")
  }

}