
fun main() {
    println("Что нужно сделать:")
    println("1.Найти колличество полных метров")
    println("2.Найти колличество полных минут")
    println("3.Найти сумму и произведение цифр двухзначного числа")
    println("4.Найти сумму и произведение цифр трёхзначного числа")
    val a = readLine()!!.toInt()
    if (a==1){
        println("Введите колличество сантиметров")
        val b = readLine()!!.toInt()
        val l = b%100
        println("Колличество метров = $l")
    }
    if (a==2){
        println("Введите колличество секунд")
        val b = readLine()!!.toDouble()
        val n = b%60
        println("Колличество минут = $n")
    }
    if (a==3){
        println("введите двухзначное число")
        val b = readLine()!!.toInt()
        if (b>99){
            break
        }
        else{
            var d = b/10 + b%10
            println("Сумма цифр двухзначного числа = $d")
        }
    }
    if (a==4){
        println("Введите трёхзначное число")
        val b = readLine()!!.toDouble()
        if (b>999){
            break
        }
        else{
           var sum = b%10 + b/10%10 + b/100
            var proizv = b%10 * b/10%10 * b/100
            println("Сумма = $sum");println("Произведение = $proizv")
        }
    }
}