import scala.io.StdIn.readLine

  object Main extends App{
    val towns = List("Montclair", "Jersey City", "Glenridge")
    class Person(var firstName: String, var lastName: String)

    println("Hello and welcome to Scala Mad libs!")
    println("Can I please have your first name?")
    val firstName = readLine()
    println("Can I please have your last name?")
    val lastName = readLine()
    val user1 = new Person(firstName, lastName)
    println(s"Great ${user1.firstName} ${user1.lastName}, lets begin!")
    println("What is your age?")
    val age = scala.io.StdIn.readInt()
    val mortalityRateMinusAge = 78 - age
    val timeLeftinMonths = mortalityRateMinusAge * 12
    val timeLeftinMinutes = 525600 * mortalityRateMinusAge
    println(s"The avg Mortality rate in the US is 78. You have $mortalityRateMinusAge years, $timeLeftinMonths months, and $timeLeftinMinutes minutes left to live")
    println("Lets check if we deliver to your town")
    println("Pleas enter your town name")
    val town = readLine()
    if(towns.contains(town)){
      println(s"We can deliver to $town")
    } else {
      println("get outta here bozo!")
    }

  }
