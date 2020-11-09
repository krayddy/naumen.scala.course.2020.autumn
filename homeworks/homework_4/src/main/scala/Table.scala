import scala.collection.mutable

class Table(_x: Int, _y: Int)
{
  val y: Int = _y
  val x: Int = _x
  val table: mutable.Seq[Cell] = scala.collection.mutable.Seq.fill(x * y)(new EmptyCell)
  var visited = Seq.empty[Int]

  def getCell(ix: Int, iy: Int): Option[Cell] =
    {
      if (ix < 0 || ix > x || iy < 0 || iy > y)
        None
      else if (table(ix + iy * y).isInstanceOf[ReferenceCell]) {
        val temp = table(ix + iy * y).asInstanceOf[ReferenceCell]
        if (!visited.contains((ix + iy * y))) {
          visited +:= ix + iy * y
          getCell(temp.ix, temp.iy)
          visited = Seq.empty[Int]
          Some(table(ix + iy * y))
        }
        else {
          table(ix + iy * y).cyclic = true
          Some(table(ix + iy * y))
        }
      }
      else Some(table(ix + iy * y))
    }

  def setCell(ix: Int, iy: Int, cell: Cell): Unit =
    {
      table(ix + iy * y) = cell
    }
}