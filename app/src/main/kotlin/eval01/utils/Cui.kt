package eval01.utils
import kotlin.text.trim


class Cui {
  private var isLive = false

    fun getUserInput() : String {
      isLive = true
      while(isLive) {
        print("> ")
        var userInput = readLine()?.trim()
        if(validInput(userInput)) {
          return userInput!!
        }
      }
      return ""
    }

    fun printToUser(output : String) {
      println("===============")
      println("${output}")
      println("===============")
    }

    fun validInput( input: String ?) : Boolean {
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
}