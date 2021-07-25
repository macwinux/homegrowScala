sealed trait CreditCard {
  import CreditCard._
  def number: String

  final def isValid: Boolean = isInstanceOf[Valid] 
  final def isNotValid: Boolean = !isValid
  
}

object CreditCard extends (String => CreditCard) {
  object Invalid {
    private[CreditCard] def apply(number: String) = new Invalid(number)
  }

  final case class Invalid private (number: String) extends CreditCard

  object Valid {
    private[CreditCard] def apply (number: String) = new Valid(number)
  }

  final case class Valid private (number: String) extends CreditCard

  def apply(number: String): CreditCard = 
    if(isValid(number))
      Valid(number)
    else
      Invalid(number)

  private def isValid(number: String): Boolean = false

  def apply(): Valid = Valid(generateNumber)

  private def generateNumber: String = "1235534"
}