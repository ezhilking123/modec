package com.ilink.home

object MapReduceFun {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(74); 

 val list= (1 to 20).toList;System.out.println("""list  : List[Int] = """ + $show(list ));$skip(22); val res$0 = 
 
 list.map(v => v*2);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(67); val res$1 = 
 //wildcard, which is travel all values in the map
 list.map(_ *2);System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(18); 
 
 val str="TEST";System.out.println("""str  : String = """ + $show(str ));$skip(27); val res$2 = 
 str.map( v => v.toLower );System.out.println("""res2: String = """ + $show(res$2));$skip(34); val res$3 = 
 
 list.filter(p => (p % 2) != 0);System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(32); val res$4 = 
 
 list.reduce((ac, n) => ac+n);System.out.println("""res4: Int = """ + $show(res$4));$skip(22); val res$5 = 
 
 list.reduce(_ + _);System.out.println("""res5: Int = """ + $show(res$5));$skip(59); val res$6 = 
 
 list.filter(p => p % 2 !=0).map(p => p*p).reduce(_ + _);System.out.println("""res6: Int = """ + $show(res$6));$skip(117); 
                                                  
 val array=Array("hi there","how are you","how things are going");System.out.println("""array  : Array[String] = """ + $show(array ));$skip(48); val res$7 = 
 //Array of Array
 array.map(f => f.split(" "));System.out.println("""res7: Array[Array[String]] = """ + $show(res$7));$skip(50); val res$8 = 
 //Single Array
 array.flatMap(f => f.split(" "));System.out.println("""res8: Array[String] = """ + $show(res$8))}
 
}
