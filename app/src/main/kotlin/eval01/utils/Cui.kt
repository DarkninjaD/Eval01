package eval01.utils
import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.options.prompt


class Cui : CliktCommand() {
  val name: String by option(help ="your name").prompt("Your name")
    override fun run() {

      println("Hello $name")
    }

}