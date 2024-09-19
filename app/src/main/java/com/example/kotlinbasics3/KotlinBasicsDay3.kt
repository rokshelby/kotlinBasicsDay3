package com.example.kotlinbasics3

    fun main(){
        val numInt1 = getNumber()
        val numInt2 = getNumber()
        val result = add(numInt1,numInt2)
        val resultDivide = divide(numInt1,numInt2)

        println("The result of $numInt1 + $numInt2 is: $result")
        println("The result of $numInt1 // $numInt2 is: $resultDivide")
    }

    fun add(num1 : Int, num2: Int):Int{
        return num1 + num2
    }

    fun divide(num1: Int, num2: Int):Double{
        return num1 / num2.toDouble()
    }

    fun getNumber():Int{
        println("input a number")
        val num1 = readln()
        return num1.toInt()
    }
