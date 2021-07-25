object Main {
  def main(args: Array[String]): Unit = {
      println("-" * 50)
      code(args)
      println("-" * 50)
  }

  def code(args: Array[String]): Unit = {
    args.headOption.map(CreditCard).map(println).getOrElse(rundemo)
  }


  private def rundemo(): Unit = {
    val validCard: CreditCard.Valid = CreditCard()
    println(validCard)
    println(validCard.number)
    println(validCard.isValid)
  }

}