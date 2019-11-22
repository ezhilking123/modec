package com.ilink.home

object MapReduceFun {

 val list= (1 to 20).toList                       //> list  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 1
                                                  //| 6, 17, 18, 19, 20)
 
 list.map(v => v*2)                               //> res0: List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30
                                                  //| , 32, 34, 36, 38, 40)
 //wildcard, which is travel all values in the map
 list.map(_ *2)                                   //> res1: List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 3
                                                  //| 0, 32, 34, 36, 38, 40)
 
 val str="TEST"                                   //> str  : String = TEST
 str.map( v => v.toLower )                        //> res2: String = test
 
 list.filter(p => (p % 2) != 0)                   //> res3: List[Int] = List(1, 3, 5, 7, 9, 11, 13, 15, 17, 19)
 
 list.reduce((ac, n) => ac+n)                     //> res4: Int = 210
 
 list.reduce(_ + _)                               //> res5: Int = 210
 
 list.filter(p => p % 2 !=0).map(p => p*p).reduce(_ + _)
                                                  //> res6: Int = 1330
                                                  
 val array=Array("hi there","how are you","how things are going")
                                                  //> array  : Array[String] = Array(hi there, how are you, how things are going)
                                                  //| 
 //Array of Array
 array.map(f => f.split(" "))                     //> res7: Array[Array[String]] = Array(Array(hi, there), Array(how, are, you), A
                                                  //| rray(how, things, are, going))
 //Single Array
 array.flatMap(f => f.split(" "))                 //> res8: Array[String] = Array(hi, there, how, are, you, how, things, are, goin
                                                  //| g)
 
}