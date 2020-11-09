import scala.collection.immutable
import scala.{+:, ::}

object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal



  case class Shelter[+T <: Animal](list: List[T])
  {
    def +[R >: T <: Animal](animal: R): Shelter[R] =
    {
      Shelter[R]((list :+ animal))
    }

    def ++[R >: T <: Animal](shelter: Shelter[R]): Shelter[R] =
      {
        Shelter[R](shelter.list ++ list)
      }

    def getNames: List[String] =
    {
      list.map(x => x.name)
    }

    def feed(food: Food[T]): List[String] =
        list.map(x => food.feed(x))
    }



  trait Food[-T <: Animal]
  {
    val food: String = ""
    def feed(animal: T): String =
    {
      s"${animal.name} eats $food"
    }
  }

  case object Meat extends Food[Animal] {
    override val food = "meat"
  }

  case object Milk extends Food[Cat]{
    override val food = "milk"
  }

  case object Bread extends Food[Dog] {
    override val food = "bread"
  }
}
