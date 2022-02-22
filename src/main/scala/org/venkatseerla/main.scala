package org.venkatseerla

object main extends App {

    println("Args: ")
    args.map(x=>println(x))
    reverseStatement("I am venkat")
    literalsInSetOneButNotInSetTwo()
    dropWhileexecution()
    elementsOfVectorFrom100to150

    //Let us assume two data structures to represent the following numerals: (1) 1, 3, 5, 10, 20 and (2) 20, 17, 18, 99, 0.
    // Write a Scala program to find the number literals that are in the first data structure, but not in the other one.
    // Conversely, also find the number literals that are in the second data structure, but not in the first one.
    // You can use whichever data structure from the standard Scala collection types.
    //Output:
    //Number literals in set one but not in set two = HashSet(5, 10, 1, 3)
    //Number literals in set two but not in set one = HashSet(0, 17, 18, 99)
    def literalsInSetOneButNotInSetTwo()={
        val setOne = Set(1, 3, 5, 10, 20)
        val setTwo = Set(20, 17, 18, 99, 0)

        val diffSetOneVSSetTwo = setOne -- setTwo
        val diffSetTwoVSSetOne = setTwo -- setOne

        println(s"Number literals in set one but not in set two = $diffSetOneVSSetTwo")
        println(s"Number literals in set two but not in set one = $diffSetTwoVSSetOne")
    }

    //Write a Scala program and use an appropriate data structure to represent the following numerical values: 2, 8, 19, 20, 25, 50, 100, 10.
    // Define a value function that will identify whether a given numeric value is divisible by 2.
    // Using this value function, and starting from the left hand side to the right hand side, remove all elements from the abovementioned data structure that are factors of two.
    // But, your program should stop removing elements as soon as a number literal is not a factor of two.
    //Output:
    //Starting from left to right, removing items that are factors of two, and will
    //stop execution on the first element that is not divisible by two: 19 20 25 50 100 10
    def dropWhileexecution()={
        val numberSeq = Seq(2, 8, 19, 20, 25, 50, 100, 10)
        val divByTwoF: (Int) => Boolean = (i) => i % 2 == 0
        println(
            """
              |Starting from left to right, removing items that are factors of two, and will
              |stop execution on the first element that is not divisible by two:
              |""".stripMargin)
        numberSeq
          .dropWhile(divByTwoF)
          .foreach(println(_))
    }

    //Reverse Statement
    def reverseStatement(str: String):String={
        println(str)
        val result =str.split(" ").reverse.mkString(" ")
        println(result)
        result
    }

    //Create a Scala program to represent a List with a sequence of number from 100 to 150.
    // You should omit the last numeric item of 150, and each numeric item should have a 10 numeric interval.
    // You should then calculate the sum of all the numeric items in the List.
    //Output:
    //Elements of Vector from 100 to 150, excluding the 150 number literal = 100, 110, 120, 130, 140
    //Sum for elements in the List = 600
    def elementsOfVectorFrom100to150()={
        val listRange = List.range(100, 150, 10)
        val listRangeAsStr = listRange.mkString(", ")
        println(s"Elements of List from 100 to 150, excluding the 150 number literal = $listRangeAsStr")
        println(s"Sum for elements in the List = ${listRange.sum}")
    }
}

