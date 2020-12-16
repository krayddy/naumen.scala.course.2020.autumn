object Exercises {


  def reverse[T](seq: Seq[T]): Seq[T] = {
    for (i <- seq.length - 1 to 0 by -1)
      yield seq(i)
  }

  def fibonacci4Index(idx: Int): Int = {
    if (idx == 0)
      0
    else if (idx == 1 || idx == 2)
      1
    else
      fibonacci4Index(idx - 1) + fibonacci4Index(idx - 2)
  }

  def fibonacci(idx: Int): Seq[Int] = {
    if (idx == 0) Seq(0)
    else if (idx == 1) Seq(0, 1)
    else if (idx == 2) Seq(0, 1, 1)
    else {
      val temp = fibonacci(idx - 1)
      temp :+ temp(temp.length - 1) + temp(temp.length - 2)
    }
  }

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
                       "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
                       "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
                       "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
                       "Y" -> "-.--", "Z" -> "--..")


  /*

   */
  def morse(text: String): String = {
    var l = ""
    for (i <- 0 until text.length)
    {
      if (MORSE.contains(text(i).toString.toUpperCase())) {
        if (i > 0) {
          if (text(i - 1).isLetter || text(i - 1) == ' ')
            l += " "
        }
        if (text(i).isLower) {
          l += MORSE(text(i).toString.toUpperCase()).toLowerCase()
        }
        else {
          l += MORSE(text(i).toString.toUpperCase()).toUpperCase()
        }
      }
      else {
        if (text(i) == ' ')
          l += " "
        l += text(i)
      }
    }
    l
  }


  def wordReverse(text: String): String = {
      text.split("(?=[!. ,?])|(?<=[ ])").map(x => if (x != "")
        {
      if (x.charAt(0).isUpper) {
        x.toLowerCase.reverse.capitalize
      }
      else {
        x.reverse
      }}).mkString("")
  }

}
