package testscala

class Rational(a: Int, b: Int) {
  require(b != 0, "denominator could not be zero")
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  def numer = a
  def denom = b

  def this(x: Int) = this(x, 1)

  def +(that: Rational) =
    new Rational(
      numer * that.denom + denom * that.numer,
      denom * that.denom)

  def unary_- : Rational = new Rational(-numer, denom)

  def -(that: Rational) = this + -that

  def *(that: Rational) =
    new Rational(numer * that.numer, denom * that.denom)

  def unary_! : Rational = new Rational(denom, numer)

  def /(that: Rational) = this * !that

  override def toString() = {
    val g = gcd(a, b)
    numer / g + "/" + denom / g
  }

  def ^(that: Int): Rational = that match {
    case 1 => this
    case _ => this * ^(that - 1)
  }
}