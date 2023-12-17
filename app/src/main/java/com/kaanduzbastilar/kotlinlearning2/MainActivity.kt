package com.kaanduzbastilar.kotlinlearning2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.HashMap
import java.util.Locale

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var x = 4;
        val myInt : Int //define - val değiştirilmeyen
        myInt = 5 //initialize

        //String
        val myString = "kaan"
        //println(myString.capitalize()) capitalize kaldırılmış kullanım değişmiş

        //Array
        val myArray = arrayOf("1", "2", "3")
        println(myArray[0])
        myArray[0] = "test"

        myArray.set(1,"deneme")
        val mixArray = arrayOf("test",3)

        //List
        val myList = arrayListOf<String>("kaan","bora")
        myList.add("ahmet")
        println(myList[2])

        myList.add(0,"rob")

        val myArrayList = ArrayList<Int>()
        myArrayList.add(1)
        myArrayList.add(300)

        val mixList = ArrayList<Any>()
        mixList.add(2)
        mixList.add(true)
        mixList.add("kaan")

        //Set - bir eleman bir kez olabiliyor içinde

        val myExampleArray = arrayListOf<Int>(1,1,2,3,4)
        println("first element : ${myExampleArray[0]}")
        println("second element : ${myExampleArray[1]}")

        val mySet = setOf<Int>(1,1,2,3)
        println(mySet.size)

        //For each
        mySet.forEach { println(it) }

        val myStringSet = HashSet<String>()
        myStringSet.add("kaan")
        myStringSet.add("kaan")
        println(myStringSet.size)

        //Map - HashMap

        //Key - Value

        val fruitArray = arrayOf("Apple","Banana")
        val caloriesArray = arrayOf("100","200")
        println("${fruitArray[0]} : ${caloriesArray[0]}")


        val fruitCaloriesMap = hashMapOf<String,Int>()
        fruitCaloriesMap.put("Apple",100)
        fruitCaloriesMap.put("Banana",150)
        println(fruitCaloriesMap["Apple"])

        val myHashMap = HashMap<String, String>()

        val myNewMap = hashMapOf<String, Int>("A" to 1, "B" to 2, "C" to 3)
        println(myNewMap["A"])


        //operators
        var m = 4
        m++
        println(m)

        //if

        //switch - when

        val day = 3
        var dayString = ""

        /*

         if(day == 1){
             println("monday")
         }else if(day == 2){
             println("tuesday")
         }else if(day == 3){
             println("wednesday")
         }
        println(dayString)

         */

        when(day) {
            1 -> dayString = "monday"
            2 -> dayString = "tuesday"
            3 -> dayString = "wednesday"
            else -> dayString = ""
        }
        println(dayString)


        //Loops

        //For Loop

        val myArrayOfNumbers = arrayOf(12,15,18,21,24,27,30,33)
        val q = myArrayOfNumbers[0] / 3 * 5
        println(q)

        for (number in myArrayOfNumbers){
            val z = number / 3 * 5
            println(z)
        }


        for (i in myArrayOfNumbers.indices){ //indices = index
            val qz = myArrayOfNumbers[i] / 3 * 5
            println(qz)
        }

        for (b in 0..9){ // 0 dan 9 a
            println(b)
        }

        val myStringArrayList = arrayListOf<String>()
        myStringArrayList.add("Kaan")
        myStringArrayList.add("Duz")
        myStringArrayList.add("Kek")

        for (str in myStringArrayList){
            println(str)
        }

        myStringArrayList.forEach { println(it) }


        //While Loop
        var j = 0
        while(j<10){
            println(j )
            j++
        }


    }

}