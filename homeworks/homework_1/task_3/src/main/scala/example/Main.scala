package example

object Main extends App {
  val a = "Hello Scala! This is Nikita Grigorev"
  println(a)
  val greetingsList = List("Hola", "Guten tag", "Privet")
  for (e <- greetingsList) println(a.replace("Hello", e))
  val splitedMessage = a.split(" ")
  val reversedName = splitedMessage(5).reverse + " " + splitedMessage(4).reverse
  for (e <- greetingsList){
    print(e)
    for (i <- 1 to 3)
    {
      print(" " + splitedMessage(i))
    }
    print(" " + reversedName)
    println("")
  }
}
