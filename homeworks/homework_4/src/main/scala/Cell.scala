class Cell
{
  var cyclic: Boolean = false
}

class EmptyCell extends Cell
{
  override def toString: String = "empty"
}

class NumberCell(number: Int) extends Cell
{
  override def toString: String = number.toString
}

class StringCell(text: String) extends Cell
{
  override def toString: String = text
}

class ReferenceCell(_ix: Int, _iy: Int, table: Table) extends Cell
{
  val ix: Int = _ix
  val iy: Int = _iy

  override def toString: String =
  {
    val reference = table.getCell(ix, iy)
    if (reference.isEmpty)
      "outOfRange"
    else if (this.cyclic)
      "cyclic"
    else
      table.table(ix + iy * table.y).toString

  }
}