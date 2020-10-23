import utest._

object Test extends TestSuite{
    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))

        }
        'sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(0, 0) == 0)
            assert(Exercises.sumOfDivBy3Or5(-3, 3) == 0)
            assert(Exercises.sumOfDivBy3Or5(-5, 3) == -5)
            assert(Exercises.sumOfDivBy3Or5(4, 6) == 11)
            assert(Exercises.sumOfDivBy3Or5(3, 5) == 8)
            assert(Exercises.sumOfDivBy3Or5(0, 25) == 0+3+5+6+9+10+12+15+18+20+21+24+25)
        }
        'primeFactor - {
            assert(Exercises.primeFactor(6) == Seq(2, 3))
            assert(Exercises.primeFactor(2) == Seq(2))
            assert(Exercises.primeFactor(80) == Seq(2, 5))
            assert(Exercises.primeFactor(98) == Seq(2, 7))
            assert(Exercises.primeFactor(9204) == Seq(2, 3, 13, 59))
        }

        'sumScalars - {
            assert(Exercises.sumScalars(Exercises.Vector2D(1,2), Exercises.Vector2D(3,4), Exercises.Vector2D(5,6), Exercises.Vector2D(7,8)) == 94)
            assert(Exercises.sumScalars(Exercises.Vector2D(1,2), Exercises.Vector2D(3,4), Exercises.Vector2D(5,6), Exercises.Vector2D(7,8)) == Exercises.scalar(Exercises.Vector2D(1,2), Exercises.Vector2D(3,4)) + Exercises.scalar(Exercises.Vector2D(5,6), Exercises.Vector2D(7,8)))
        }
        'sumCosines - {
            assert(Exercises.sumCosines(Exercises.Vector2D(1,2), Exercises.Vector2D(3,4), Exercises.Vector2D(5,6), Exercises.Vector2D(7,8)) == Exercises.cosBetween(Exercises.Vector2D(1,2), Exercises.Vector2D(3,4)) + Exercises.cosBetween(Exercises.Vector2D(5,6), Exercises.Vector2D(7,8)))
            assert(Exercises.sumCosines(Exercises.Vector2D(1,2), Exercises.Vector2D(3,4), Exercises.Vector2D(5,6), Exercises.Vector2D(7,8)) == 0.9838699100999074 + 0.9997098084674824)
        }
        'sortByHeavyweight - {
            assert(Exercises.sortByHeavyweight() == Seq("Tin","Platinum","Nickel","Aluminum","Titanium","Lead","Sodium","Uranium","Gold","Tungsten","Zirconium","Chrome","Iron","Copper","Silver","Plutonium","Cobalt","Cesium","Calcium","Lithium","Magnesium", "Potassium", "Graphite"))
        }
    }
}
