package eval01.utils
import kotlin.text.trim


class Cui  {
  private var isLive = false

  /**
   * This will get the user's input via the CUI
   * the user can quit out via "quit","q","exit"
   * @return the user input as a string
   * @sample Cui.example
   */
    fun getUserInput() : String {
      isLive = true
      while(isLive) {
        print("> ")
        val userInput = readlnOrNull()?.trim()
        if(validInput(userInput)) {
          return userInput!!
        }
      }
      return ""
    }

  /**
   * This will print a message to the user.
   * @param output the message you want to display
   * @sample Cui.example
   */
    fun printToUser(output : String) {
      println("===============")
      println(output)
      println("===============")
    }

    private fun validInput(input: String ?) : Boolean {
      when (input) {
        "" -> println("Please input something")
        "exit" -> isLive = false
        "quit" -> isLive = false
        "q" -> isLive = false
        else -> {
          isLive = false
          return true
        }
      }
      return false
    }

  /**
   * Example of the simple CUI
   * @see Cui.printToUser
   * @see Cui.getUserInput
   * @sample Cui.example
   **/
  fun example() : Unit {
    val cui = Cui()
    cui.printToUser("Please input your name")
    val name = cui.getUserInput()
    cui.printToUser("Hello, $name")
  }
}