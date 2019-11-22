package com.ilink.home



object NextLevel {
  println("Welcome to the Scala worksheet")
  
   println("Just Print")
   
    var justList= List(22,33,44,55,66,77,88,99,100)
 
 var twoList=justList.partition(p => p>40)
 
 val part1=twoList._1
 val part2=twoList._2
 
 
 val (l1,l2)=justList.partition(p => p>40)
                                                  
 val value1= { val v1=300; val v2=400; v1+v2 }

// lazy computing
  lazy val lazyVal= 500
  val lsval=400
 
 var hugeList= (1 to 10).toList
 
 var red=hugeList.reduce(_+_)
 
 //var aaa=hugeList.reduce()
 
 //for (i <- 1 to 5) println(i)
 //for (j <- 5 to 1 by -1 ) println(j)
   //for (i <- 1 to 3; j<- 1 to 2 ) println(s"($i, $j)")
   
  /* for( i <- 1 to 4; j <- 1 to 3)
   if(i == j) println (s"( $i, $j)")
    */
   // To avoid inside the loop everytime, can check during looping itself.
    for( i <- 1 to 4 ; j <-1 to 4; if(i==j)) println(s"($i, $j)")
 
 
 }