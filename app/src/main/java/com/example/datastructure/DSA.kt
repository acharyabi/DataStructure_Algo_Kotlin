package com.example.datastructure

fun main(){
    /*
    //Immutable List

    //Defining an Immutable lis

    val list1= listOf<Int>(4,5,6)
    val list2= listOf("Jack","John","Hari")

    /*
    This gives error because of the list being immutable:it can't be modifed.
    list1.add*/

    for (item in list1){
        println(item)
    }
    for (item in list2){
        println(item)
    }

    //Mutable List: Supports read and write operations
    var mutList = mutableListOf("Jack","John","Mike")

    //Modifying the elements
    mutList[2] ="Jason "

    //Adding the elements
    mutList.add("Roey")

    //Read all the elements of the mutable list
    for (item in mutList) {
        println(item)
    }
    */

    //Immutable Set
    var immutableSet = setOf(5,6,"Hello",6,1,0,1)

    //Only the unique elements will be printed
    for(item in immutableSet){
        println(item)
    }

    //Mutable Set
    var mutableSet= mutableSetOf(5,6,"Hello",6,1,0,1)

    //Add Elements
    mutableSet.add(77)
    mutableSet.add("Hero")

    //Remove Element
    mutableSet.remove(6)

    for(item in mutableSet){
        println(item)
    }

}
