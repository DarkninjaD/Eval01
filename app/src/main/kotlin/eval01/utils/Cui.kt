package eval01.utils
import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.options.prompt
import java.util.LinkedList
import java.util.Queue
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