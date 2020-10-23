package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'booleanformater1 - {
            assert(Exercises.prettyBooleanFormatter1(true) == "правда")
            assert(Exercises.prettyBooleanFormatter1(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter1(3) == "3")
            assert(Exercises.prettyBooleanFormatter1("hi") == "hi")
        }
        'booleanformater2 - {
            assert(Exercises.prettyBooleanFormatter2(true) == "правда")
            assert(Exercises.prettyBooleanFormatter2(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter2(6) == "6")
            assert(Exercises.prettyBooleanFormatter2("bye") == "bye")
        }
        'booleanformater3 - {
            assert(Exercises.prettyBooleanFormatter3(true) == "правда")
            assert(Exercises.prettyBooleanFormatter3(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter3(13) == "13")
            assert(Exercises.prettyBooleanFormatter3("why") == "why")
        }
        'max1 - {
            assert(Exercises.max1(Seq(0,1,2,3,4,5)) == 5)
            assert(Exercises.max1(Seq()) == Int.MinValue)
            assert(Exercises.max1(Seq(-1)) == -1)
        }
        'max2 - {
            assert(Exercises.max2(Seq(0,1,2,3,4,5)) == Seq(5))
            assert(Exercises.max2(Seq()) == Seq())
            assert(Exercises.max2(Seq(0)) == Seq(0))
        }
        'max3 - {
            assert(Exercises.max3(Seq(0,1,2,3,4,5)) == Option[Int](5))
            assert(Exercises.max3(Seq()) == None)
            assert(Exercises.max3(Seq(-1)) == Option[Int](-1))
        }
        'sum1 - {
            assert(Exercises.sum1(4, 2) == 6)
            assert(Exercises.sum1(0, 0) == 0)
            assert(Exercises.sum1(-5, 6) == 1)
        }
        'sum2 - {
            assert(Exercises.sum2(1, 1) == 2)
            assert(Exercises.sum2(0, 3) == 3)
            assert(Exercises.sum2(-6, 6) == 0)
        }
        'sum3 - {
            assert(Exercises.sum3(4, 4) == 8)
            assert(Exercises.sum3(0, 1) == 1)
            assert(Exercises.sum3(-3, 6) == 3)
        }
    }
}