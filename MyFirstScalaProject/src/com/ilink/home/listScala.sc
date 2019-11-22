package com.ilink.home

import scala.collection.mutable.ArrayBuffer
import scala.collection.Map

object listScala {

	var list = for (i <- 1 to 10; if i % 2 == 0) yield(i)
                                                  //> list  : scala.collection.immutable.IndexedSeq[Int] = Vector(2, 4, 6, 8, 10)
                                                  //| 
	println(list)                             //> Vector(2, 4, 6, 8, 10)
	
	// Function : if declare Unit it doesn't return anything.
	def rect (f1: Float, f2 :Float) : Float = { f1 *f2 }
                                                  //> rect: (f1: Float, f2: Float)Float
 	rect(12.2f,12.3f)                         //> res0: Float = 150.06
 	
 	var arrBuff= new ArrayBuffer[Int]()       //> arrBuff  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()
 	arrBuff += 100                            //> res1: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(100)
 	arrBuff += 200                            //> res2: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(100, 200)
 	arrBuff ++= Array(300,400,500)            //> res3: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(100, 200, 300,
                                                  //|  400, 500)
  println(arrBuff)                                //> ArrayBuffer(100, 200, 300, 400, 500)
  
  var map= Map( 1 -> "Ezhil", 2 -> "Selvaraj")    //> map  : scala.collection.Map[Int,String] = Map(1 -> Ezhil, 2 -> Selvaraj)
 	
  }