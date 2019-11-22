package com.ilink.home



object NextLevel {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(88); 
  println("Welcome to the Scala worksheet");$skip(28); 
  
   println("Just Print");$skip(56); 
   
    var justList= List(22,33,44,55,66,77,88,99,100);System.out.println("""justList  : List[Int] = """ + $show(justList ));$skip(45); 
 
 var twoList=justList.partition(p => p>40);System.out.println("""twoList  : (List[Int], List[Int]) = """ + $show(twoList ));$skip(24); 
 
 val part1=twoList._1;System.out.println("""part1  : List[Int] = """ + $show(part1 ));$skip(22); 
 val part2=twoList._2;System.out.println("""part2  : List[Int] = """ + $show(part2 ));$skip(47); 
 
 
 val (l1,l2)=justList.partition(p => p>40);System.out.println("""l1  : List[Int] = """ + $show(l1 ));System.out.println("""l2  : List[Int] = """ + $show(l2 ));$skip(98); 
                                                  
 val value1= { val v1=300; val v2=400; v1+v2 };System.out.println("""value1  : Int = """ + $show(value1 ));$skip(43); 

// lazy computing
  lazy val lazyVal= 500;System.out.println("""lazyVal: => Int = <lazy>""");$skip(16); 
  val lsval=400;System.out.println("""lsval  : Int = """ + $show(lsval ));$skip(34); 
 
 var hugeList= (1 to 10).toList;System.out.println("""hugeList  : List[Int] = """ + $show(hugeList ));$skip(32); 
 
 var red=hugeList.reduce(_+_);System.out.println("""red  : Int = """ + $show(red ));$skip(386); 
 
 //var aaa=hugeList.reduce()
 
 //for (i <- 1 to 5) println(i)
 //for (j <- 5 to 1 by -1 ) println(j)
   //for (i <- 1 to 3; j<- 1 to 2 ) println(s"($i, $j)")
   
  /* for( i <- 1 to 4; j <- 1 to 3)
   if(i == j) println (s"( $i, $j)")
    */
   // To avoid inside the loop everytime, can check during looping itself.
    for( i <- 1 to 4 ; j <-1 to 4; if(i==j)) println(s"($i, $j)")}
 
 
 }
