/*
This program is made for counting factorial

 */

import java.util.Scanner; // import scanner class from java library


fun main(args: Array<String>){

    /*
    Code start
     */


    //create scanner object
    val sc = Scanner(System.`in`)

    //opening message
    println("Heloo. Now you're using factorial counting program")
    println("first you have to input the number of factorial that you want to know :)")
    println("Input number :")

    //reading int input
    var n: Int = sc.nextInt()
    println()

    //process message
    println("You entered : $n")
    println("Now we'll start counting. Please wait :)")
    println("...... ..... .... ... .. . ")

    //counting process
    var total = 1
    for (i in 1..n){
        total *= i

    }

    //result
    println("The process is finished")
    println("This is the result of factorial of $n = $total")

}