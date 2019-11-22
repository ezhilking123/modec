package com.ilink.home

object functions {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(98); 

		def add(first: Int, second: Int): Int = first+second;System.out.println("""add: (first: Int, second: Int)Int""");$skip(16); val res$0 = 
		
		add(10,20);System.out.println("""res0: Int = """ + $show(res$0));$skip(247); 
	
	
	// Just assign the function to antother variable in this case we need to mention at the end of the functin with _ (underscore letter)
	//we inform to compile we just for assign the function and no need to call the function.
	
		val f = add _;System.out.println("""f  : (Int, Int) => Int = """ + $show(f ));$skip(11); val res$1 = 
		f(20,40);System.out.println("""res1: Int = """ + $show(res$1));$skip(41); 
		
		def mul(a: Int, b: Int) : Int = a*b;System.out.println("""mul: (a: Int, b: Int)Int""");$skip(11); val res$2 = 
		mul(2,2);System.out.println("""res2: Int = """ + $show(res$2));$skip(40); 
		
		def sub(a:Int, b:Int): Int = {a-b};System.out.println("""sub: (a: Int, b: Int)Int""");$skip(11); val res$3 = 
		sub(2,3);System.out.println("""res3: Int = """ + $show(res$3));$skip(106); 
		
		def genericOperation( fun: (Int, Int) => Int , first: Int, second: Int  ) : Int = fun(first, second);System.out.println("""genericOperation: (fun: (Int, Int) => Int, first: Int, second: Int)Int""");$skip(29); val res$4 = 
		genericOperation(mul,2, 4);System.out.println("""res4: Int = """ + $show(res$4));$skip(30); val res$5 = 
		genericOperation(sub, 6, 5);System.out.println("""res5: Int = """ + $show(res$5));$skip(71); val res$6 = 
		
		// analymous functions
		
		genericOperation( (a, b) => a+b, 3,5);System.out.println("""res6: Int = """ + $show(res$6))}
}
