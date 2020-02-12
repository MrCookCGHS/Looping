fun main () {

    var userInput:Int = 0
    var output = "null"
    var counter = 0

    do  {
        println("Welcome to Cook's Cafe.")
        println("1. Coffee")
        println("2. Tea")
        println("3. Orange Juice")
        println("4. Water")
        println("5. Hot Cocoa")
        println("6. Exit.  No purchase")

        println ("Choose one of the above:__")
        userInput = readLine()!!.toInt()

        when (userInput) {
            1 -> output = "Coffee $2.50"
            2 -> output = "Tea $2.00"
            3 -> output = "OJ $1.50"
            4 -> output = "Water $1.00"
            5 -> output = "Hot Cocoa $.50"
            6 -> output = "No purchase.  Come again"
            !in 1..6 -> output = "Invalid selection. Please try again."
        }

        if (userInput in 1..6) {
            counter++
        }

        println("You have selected:")
        println ("$output")

    } while (counter<1)


    print ("Thank You!")

}