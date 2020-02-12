fun main () {

    var userInput:Int = 1
    var output = "null"
    var count:Int = 0

    do {
        println("Welcome to Cook's Cafe.  We have 5 selections")
        println("1. Coffee")
        println("2. Tea")
        println("3. Orange Juice")
        println("4. Water")
        println("5. Hot Cocoa")

        print ("Choose one of the above")
        userInput = readLine()!!.toInt()

        when (userInput) {
            1 -> output = "Coffee $2.50"
            2 -> output = "Tea $2.00"
            3 -> output = "OJ $1.50"
            4 -> output = "Water $1.00"
            5 -> output = "Hot Cocoa $.50"
        }
        count++
        print ("You choose $output.  Thank You!")

    } while (count<1)


}