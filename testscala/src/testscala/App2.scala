package testscala


object App2 extends App {
  val r1 = new Rational(7,4);
  val r2 = new Rational(2,3);
  
  
  val r3 = new Rational(2);
  val r4 = new Rational(3);
  
  println((r3+r4)*(r3+r4))
  
  println((r3+r4)^2)
  
  println((r3*r3)+new Rational(2)*r3*r4+(r4*r4))
  
  println((r1 + r2) / (r1 - r2) )
  
  println((r1 + r2) / (r1 - r2) )
  
  println(r1 - r2)
  
  println(r1 * r2)
  
  println(r1 / r2)
}

 