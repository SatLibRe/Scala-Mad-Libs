import scala.io.StdIn.readLine

  object Main extends App{
    println("Hello and welcome to Scala Mad libs!")
    println("Can I please have your first name?")
    val firstName = readLine()
    println("Can I please have your last name?")
    val lastName = readLine()
    println(s"Great $firstName $lastName, lets begin!")
    println("What is your age?")
    val age = scala.io.StdIn.readInt()
    val mortalityRateMinusAge = 78 - age
    val timeLeftinMonths = mortalityRateMinusAge * 12
    val timeLeftinMinutes = 525600 * mortalityRateMinusAge
    println(s"The avg Mortality rate in the US is 78. You have $mortalityRateMinusAge years, $timeLeftinMonths months, and $timeLeftinMinutes minutes left to live")
    println("Good luck!")
  }
