package testscala

object testscala extends App {
 def sum (f: Int => Int)( a:Int,  b:Int) : Int = {
     def loop (a:Int , acc:Int) : Int = 
         if(a > b)  acc  
         else loop (a+1, acc =acc + f(a)) 
     loop (a, 0)
 }
 println ("sum of square 1 to 5 => " + sum( x=>x*x)(1,5))
 println ("sum of cube 1 to 5 => " +sum(x=>x*x*x)(1,5))
 println ("sum of divide by 2 of 1 to 5 => " +sum(x => x/2)( 1, 5))
 println ("sum of addition of 3 to 1 to 5 => " + sum(x=>x+3)(1,5))
 
   def product (f :Int => Int)(a:Int ,b:Int):Int=
   if (a>b) 1 else
      f(a) * product(f) (a+1, b)
     
   println("Product of square => "+product(x=>x*x)(1, 3))     
  
  def fact(n:Int):Int = product(x=>x)(1, n)
  
  println ("fact of 5 is "+fact(5))  
  
  
  def divide(h:Int=>Int)(f:Int=>Int)(g:Int=>Int)(a:Int)(c:Int): Int=
   if (a>c) h(a) else{
	   println(f(a)+"\t"+g(a))
     f(a)/g(a) +  divide(h)(f)(g)(a+1)(c);
   }
 
 println ("wierd function "+divide(x=>5) (x=>x*x)(y=>y)(1)(6))
}
