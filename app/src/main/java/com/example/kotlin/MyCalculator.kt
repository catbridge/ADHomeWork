package com.example.kotlin

fun main(){
    println("Калькулятор начал работу")
    println("Доступные операции: \n + - сложить,\n - - вычесть, \n / - разделить, \n * - умножить, \n = - получить результат и закончить работу калькулятора")
    println("Введите число: ")
    val x = readln().toDouble()
    println("Введите знак операции: ")
    var str = readLine().toString()
    println("Введите число: ")
    var y = readln().toDouble()
    var result = Calculator(opSymbol = str, firstValue = x, secondValue = y).calculate()
    do{
        //println("(= $result)") //чтобы смотреть промежуточный результат
        println("Введите знак операции")
        str = readLine().toString()
        if(str != "="){
            println("Введите число")
            y = readln().toDouble()
            result = Calculator(firstValue = result, opSymbol = str, secondValue = y).calculate()
        }
    }while (str != "=")
    println("Результат: $result \nКалькулятор закончил работу.")

}

class Calculator (val opSymbol: String = "", val firstValue: Double, val secondValue: Double){
    fun calculate() : Double {
        when(this.opSymbol) {
            "+" -> return firstValue + secondValue
            "-" -> return firstValue - secondValue
            "*" -> return firstValue * secondValue
            "/" -> return firstValue / secondValue
        }
        return this.opSymbol.toDouble()
    }
}