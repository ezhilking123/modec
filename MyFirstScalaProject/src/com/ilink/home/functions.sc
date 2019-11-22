package com.ilink.home

object functions {

		def add(first: Int, second: Int): Int = first+second
                                                  //> add: (first: Int, second: Int)Int
		
		add(10,20)                        //> res0: Int = 30
	
	
	// Just assign the function to antother variable in this case we need to mention at the end of the functin with _ (underscore letter)
	//we inform to compile we just for assign the function and no need to call the function.
	
		val f = add _                     //> f  : (Int, Int) => Int = com.ilink.home.functions$$$Lambda$8/2083562754@49e4
                                                  //| cb85
		f(20,40)                          //> res1: Int = 60
		
		def mul(a: Int, b: Int) : Int = a*b
                                                  //> mul: (a: Int, b: Int)Int
		mul(2,2)                          //> res2: Int = 4
		
		def sub(a:Int, b:Int): Int = {a-b}//> sub: (a: Int, b: Int)Int
		sub(2,3)                          //> res3: Int = -1
		
		def genericOperation( fun: (Int, Int) => Int , first: Int, second: Int  ) : Int = fun(first, second)
                                                  //> genericOperation: (fun: (Int, Int) => Int, first: Int, second: Int)Int
		genericOperation(mul,2, 4)        //> res4: Int = 8
		genericOperation(sub, 6, 5)       //> res5: Int = 1
		
		// analymous functions
		
		genericOperation( (a, b) => a+b, 3,5)
                                                  //> res6: Int = 8
}