package com.ilink.home

import scala.collection.mutable.ArrayBuffer
import scala.collection.Map

object listScala {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(171); 

	var list = for (i <- 1 to 10; if i % 2 == 0) yield(i);System.out.println("""list  : scala.collection.immutable.IndexedSeq[Int] = """ + $show(list ));$skip(15); 
	println(list);$skip(115); 
	
	// Function : if declare Unit it doesn't return anything.
	def rect (f1: Float, f2 :Float) : Float = { f1 *f2 };System.out.println("""rect: (f1: Float, f2: Float)Float""");$skip(20); val res$0 = 
 	rect(12.2f,12.3f);System.out.println("""res0: Float = """ + $show(res$0));$skip(41); 
 	
 	var arrBuff= new ArrayBuffer[Int]();System.out.println("""arrBuff  : scala.collection.mutable.ArrayBuffer[Int] = """ + $show(arrBuff ));$skip(17); val res$1 = 
 	arrBuff += 100;System.out.println("""res1: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$1));$skip(17); val res$2 = 
 	arrBuff += 200;System.out.println("""res2: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$2));$skip(33); val res$3 = 
 	arrBuff ++= Array(300,400,500);System.out.println("""res3: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$3));$skip(19); 
  println(arrBuff);$skip(50); 
  
  var map= Map( 1 -> "Ezhil", 2 -> "Selvaraj");System.out.println("""map  : scala.collection.Map[Int,String] = """ + $show(map ))}
 	
  }
