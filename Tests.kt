package com.example.sudoku


fun main() {

      check(
            name = "when have sudoku with size 4x4 with not duplicated numbers in rows, columns and subgrids, it should return true",
            result = isSudokuValid(listOf(
                  listOf("1", "2", "3", "4"),
                  listOf("3", "4", "1", "2"),
                  listOf("2", "1", "4", "3"),
                  listOf("4", "3", "2", "1")
            )),
            correctResult = true
      )

      check(
            name = "when have sudoku with size 9x9 with not duplicated numbers in rows, columns and subgrids, it should return true",
            result = isSudokuValid(listOf(
                  listOf("5", "3", "4", "6", "7", "8", "9", "1", "2"),
                  listOf("6", "7", "2", "1", "9", "5", "3", "4", "8"),
                  listOf("1", "9", "8", "3", "4", "2", "5", "6", "7"),

                  listOf("8", "5", "9", "7", "6", "1", "4", "2", "3"),
                  listOf("4", "2", "6", "8", "5", "3", "7", "9", "1"),
                  listOf("7", "1", "3", "9", "2", "4", "8", "5", "6"),

                  listOf("9", "6", "1", "5", "3", "7", "2", "8", "4"),
                  listOf("2", "8", "7", "4", "1", "9", "6", "3", "5"),
                  listOf("3", "4", "5", "2", "8", "6", "1", "7", "9")
            )),
            correctResult = true
      )

      check(
            name = "when have sudoku with size 16x16 with not duplicated numbers in rows, columns and subgrids, it should return true",
            result = isSudokuValid(listOf(
                  listOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16"),
                  listOf("5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "1", "2", "3", "4"),
                  listOf("9", "10", "11", "12", "13", "14", "15", "16", "1", "2", "3", "4", "5", "6", "7", "8"),
                  listOf("13", "14", "15", "16", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"),

                  listOf("2", "1", "4", "3", "6", "5", "8", "7", "10", "9", "12", "11", "14", "13", "16", "15"),
                  listOf("6", "5", "8", "7", "10", "9", "12", "11", "14", "13", "16", "15", "2", "1", "4", "3"),
                  listOf("10", "9", "12", "11", "14", "13", "16", "15", "2", "1", "4", "3", "6", "5", "8", "7"),
                  listOf("14", "13", "16", "15", "2", "1", "4", "3", "6", "5", "8", "7", "10", "9", "12", "11"),

                  listOf("3", "4", "1", "2", "7", "8", "5", "6", "11", "12", "9", "10", "15", "16", "13", "14"),
                  listOf("7", "8", "5", "6", "11", "12", "9", "10", "15", "16", "13", "14", "3", "4", "1", "2"),
                  listOf("11", "12", "9", "10", "15", "16", "13", "14", "3", "4", "1", "2", "7", "8", "5", "6"),
                  listOf("15", "16", "13", "14", "3", "4", "1", "2", "7", "8", "5", "6", "11", "12", "9", "10"),

                  listOf("4", "3", "2", "1", "8", "7", "6", "5", "12", "11", "10", "9", "16", "15", "14", "13"),
                  listOf("8", "7", "6", "5", "12", "11", "10", "9", "16", "15", "14", "13", "4", "3", "2", "1"),
                  listOf("12", "11", "10", "9", "16", "15", "14", "13", "4", "3", "2", "1", "8", "7", "6", "5"),
                  listOf("16", "15", "14", "13", "4", "3", "2", "1", "8", "7", "6", "5", "12", "11", "10", "9")
            )),
            correctResult = true
      )

      check(
            name = "when have sudoku with size 4x4, 9x9 or 16x16 and some cells are dash, it should return true",
            result = isSudokuValid(listOf(
                  listOf("-", "-", "4", "6", "-", "8", "-", "1", "-"),
                  listOf("6", "7", "2", "1", "9", "5", "3", "4", "8"),
                  listOf("1", "9", "-", "3", "4", "2", "5", "6", "7"),

                  listOf("8", "-", "9", "-", "-", "1", "4", "2", "3"),
                  listOf("4", "2", "6", "8", "5", "3", "-", "9", "1"),
                  listOf("7", "1", "-", "9", "2", "4", "8", "5", "6"),

                  listOf("9", "6", "-", "5", "3", "7", "2", "8", "4"),
                  listOf("2", "8", "7", "4", "1", "9", "6", "3", "5"),
                  listOf("-", "4", "-", "2", "8", "-", "1", "7", "-")
            )),
            correctResult = true
      )

      check(
            name = "when have sudoku with size 4x4, 9x9 or 16x16 and all cells is dash , it should return true",
            result = isSudokuValid(listOf(
                  listOf("-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"),
                  listOf("-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"),
                  listOf("-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"),
                  listOf("-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"),

                  listOf("-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"),
                  listOf("-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"),
                  listOf("-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"),
                  listOf("-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"),

                  listOf("-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"),
                  listOf("-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"),
                  listOf("-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"),
                  listOf("-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"),

                  listOf("-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"),
                  listOf("-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"),
                  listOf("-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"),
                  listOf("-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"),


            )),
            correctResult = true
      )

      check(
            name = "when have sudoku with 8 rows and 9 columns not square size, it should return false",
            result = isSudokuValid(listOf(
                  listOf("5", "3", "4", "6", "7", "8", "9", "1", "2"),
                  listOf("6", "7", "2", "1", "9", "5", "3", "4", "8"),
                  listOf("1", "9", "8", "3", "4", "2", "5", "6", "7"),

                  listOf("8", "5", "9", "7", "6", "1", "4", "2", "3"),
                  listOf("4", "2", "6", "8", "5", "3", "7", "9", "1"),
                  listOf("7", "1", "3", "9", "2", "4", "8", "5", "6"),

                  listOf("9", "6", "1", "5", "3", "7", "2", "8", "4"),
                  listOf("2", "8", "7", "4", "1", "9", "6", "3", "5")
            )),
            correctResult = false
      )

      check(
            name = "when have sudoku with 9 rows and 8 columns not square size, it should return false",
            result = isSudokuValid(listOf(
                  listOf("3", "4", "6", "7", "8", "9", "1", "2"),
                  listOf("7", "2", "1", "9", "5", "3", "4", "8"),
                  listOf("9", "8", "3", "4", "2", "5", "6", "7"),

                  listOf("5", "9", "7", "6", "1", "4", "2", "3"),
                  listOf("2", "6", "8", "5", "3", "7", "9", "1"),
                  listOf("1", "3", "9", "2", "4", "8", "5", "6"),

                  listOf("6", "1", "5", "3", "7", "2", "8", "4"),
                  listOf("8", "7", "4", "1", "9", "6", "3", "5"),
                  listOf("4", "5", "2", "8", "6", "1", "7", "9")
            )),
            correctResult = false
      )

      check(
            name = "when have sudoku with square size but not 4, 9 or 16, it should return false",
            result = isSudokuValid(listOf(
                  listOf("1", "2", "3", "4", "5"),
                  listOf("3", "4", "1", "2", "-"),
                  listOf("2", "1", "4", "3", "-"),
                  listOf("4", "3", "2", "1", "-"),
                  listOf("-", "-", "-", "-", "-")
            )),
            correctResult = false
      )

      check(
            name = "when have sudoku with any size contain repeated number in the row , it should return false",
            result = isSudokuValid(listOf(
                  listOf("5", "3", "4", "6", "7", "2", "9", "1", "2"),
                  listOf("6", "7", "2", "1", "9", "5", "3", "4", "8"),
                  listOf("1", "9", "8", "3", "4", "-", "5", "6", "7"),

                  listOf("8", "5", "9", "7", "6", "1", "4", "2", "3"),
                  listOf("4", "2", "6", "8", "5", "3", "7", "9", "1"),
                  listOf("7", "1", "3", "9", "2", "4", "8", "5", "6"),

                  listOf("9", "6", "1", "5", "3", "7", "2", "8", "4"),
                  listOf("2", "8", "7", "4", "1", "9", "6", "3", "5"),
                  listOf("3", "4", "5", "2", "8", "6", "1", "7", "9")
            )),
            correctResult = false
      )

      check(
            name = "when have sudoku with any size contain repeated number in the column , it should return false",
            result = isSudokuValid(listOf(
                  listOf("5", "3", "4", "6", "7", "8", "9", "1", "2"),
                  listOf("6", "7", "2", "1", "9", "5", "3", "4", "8"),
                  listOf("1", "9", "8", "3", "4", "2", "5", "6", "7"),

                  listOf("-", "-", "9", "-", "7", "1", "4", "2", "3"),
                  listOf("4", "2", "6", "8", "5", "3", "7", "9", "1"),
                  listOf("7", "1", "3", "9", "2", "4", "8", "5", "6"),

                  listOf("9", "6", "1", "5", "3", "7", "2", "8", "4"),
                  listOf("2", "8", "7", "4", "1", "9", "6", "3", "5"),
                  listOf("3", "4", "5", "2", "8", "6", "1", "7", "9")
            )),
            correctResult = false
      )

      check(
            name = "when have sudoku with any size contain repeated number in subgrid , it should return false",
            result = isSudokuValid(listOf(
                  listOf("5", "3", "4", "6", "7", "8", "9", "1", "2"),
                  listOf("8", "7", "2", "1", "9", "5", "3", "4", "-"),
                  listOf("1", "9", "8", "3", "4", "2", "5", "6", "7"),

                  listOf("-", "5", "9", "7", "6", "1", "4", "2", "3"),
                  listOf("4", "2", "6", "8", "5", "3", "7", "9", "1"),
                  listOf("7", "1", "3", "9", "2", "4", "8", "5", "6"),

                  listOf("9", "6", "1", "5", "3", "7", "2", "8", "4"),
                  listOf("2", "8", "7", "4", "1", "9", "6", "3", "5"),
                  listOf("3", "4", "5", "2", "8", "6", "1", "7", "9")
            )),
            correctResult = false
      )

      check(
            name = "when have sudoku with any size contain number smaller than 1 , it should return false",
            result = isSudokuValid(listOf(
                  listOf("-5", "3", "4", "6", "7", "8", "9", "1", "2"),
                  listOf("6", "7", "2", "1", "9", "5", "3", "4", "8"),
                  listOf("1", "9", "8", "3", "4", "2", "5", "6", "7"),

                  listOf("8", "5", "9", "7", "6", "1", "4", "2", "3"),
                  listOf("4", "2", "6", "8", "5", "3", "7", "9", "1"),
                  listOf("7", "1", "3", "9", "2", "4", "8", "5", "6"),

                  listOf("9", "6", "1", "5", "3", "7", "2", "8", "4"),
                  listOf("2", "8", "7", "4", "1", "9", "6", "3", "5"),
                  listOf("3", "4", "5", "2", "8", "6", "1", "7", "9")
            )),
            correctResult = false
      )

      check(
            name = "when have sudoku with any size contain anything not number or dash , it should return false",
            result = isSudokuValid(listOf(
                  listOf("ab&", "3", "4", "6", "7", "8", "9", "1", "2"),
                  listOf("6", "7", "2", "1", "9", "5", "3", "4", "8"),
                  listOf("1", "9", "8", "3", "4", "2", "5", "6", "7"),

                  listOf("8", "5", "9", "7", "6", "1", "4", "2", "3"),
                  listOf("4", "2", "6", "8", "5", "3", "7", "9", "1"),
                  listOf("7", "1", "3", "9", "2", "4", "8", "5", "6"),

                  listOf("9", "6", "1", "5", "3", "7", "2", "8", "4"),
                  listOf("2", "8", "7", "4", "1", "9", "6", "3", "5"),
                  listOf("3", "4", "5", "2", "8", "6", "1", "7", "9")
            )),
            correctResult = false
      )


      check(
            name = "when have empty list, it should return false",
            result = isSudokuValid(listOf()),
            correctResult = false
      )

      check(
            name = "when have empty list in any index inside list, it should return false",
            result = isSudokuValid(listOf(listOf("1","2","3","4"),
                                          listOf()
            )),
            correctResult = false
      )

      check(
            name = "when have sudoku with size 4x4 and contain number bigger than 4, it should return false",
            result = isSudokuValid(listOf(
                  listOf("5", "2", "3", "4"),
                  listOf("3", "4", "1", "2"),
                  listOf("2", "1", "4", "3"),
                  listOf("4", "3", "2", "1")
            )),
            correctResult = false
      )

      check(
            name = "when have sudoku with size 9x9 and contain number bigger than 9, it should return false",
            result = isSudokuValid(listOf(
                  listOf("10", "3", "4", "6", "7", "8", "9", "1", "2"),
                  listOf("6", "7", "2", "1", "9", "5", "3", "4", "8"),
                  listOf("1", "9", "8", "3", "4", "2", "5", "6", "7"),

                  listOf("8", "5", "9", "7", "6", "1", "4", "2", "3"),
                  listOf("4", "2", "6", "8", "5", "3", "7", "9", "1"),
                  listOf("7", "1", "3", "9", "2", "4", "8", "5", "6"),

                  listOf("9", "6", "1", "5", "3", "7", "2", "8", "4"),
                  listOf("2", "8", "7", "4", "1", "9", "6", "3", "5"),
                  listOf("3", "4", "5", "2", "8", "6", "1", "7", "9")
            )),
            correctResult = false
      )

      check(
            name = "when have sudoku with size 16x16 and contain number bigger than 16, it should return false",
            result = isSudokuValid(listOf(
                  listOf("17", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16"),
                  listOf("5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "1", "2", "3", "4"),
                  listOf("9", "10", "11", "12", "13", "14", "15", "16", "1", "2", "3", "4", "5", "6", "7", "8"),
                  listOf("13", "14", "15", "16", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"),

                  listOf("2", "1", "4", "3", "6", "5", "8", "7", "10", "9", "12", "11", "14", "13", "16", "15"),
                  listOf("6", "5", "8", "7", "10", "9", "12", "11", "14", "13", "16", "15", "2", "1", "4", "3"),
                  listOf("10", "9", "12", "11", "14", "13", "16", "15", "2", "1", "4", "3", "6", "5", "8", "7"),
                  listOf("14", "13", "16", "15", "2", "1", "4", "3", "6", "5", "8", "7", "10", "9", "12", "11"),

                  listOf("3", "4", "1", "2", "7", "8", "5", "6", "11", "12", "9", "10", "15", "16", "13", "14"),
                  listOf("7", "8", "5", "6", "11", "12", "9", "10", "15", "16", "13", "14", "3", "4", "1", "2"),
                  listOf("11", "12", "9", "10", "15", "16", "13", "14", "3", "4", "1", "2", "7", "8", "5", "6"),
                  listOf("15", "16", "13", "14", "3", "4", "1", "2", "7", "8", "5", "6", "11", "12", "9", "10"),

                  listOf("4", "3", "2", "1", "8", "7", "6", "5", "12", "11", "10", "9", "16", "15", "14", "13"),
                  listOf("8", "7", "6", "5", "12", "11", "10", "9", "16", "15", "14", "13", "4", "3", "2", "1"),
                  listOf("12", "11", "10", "9", "16", "15", "14", "13", "4", "3", "2", "1", "8", "7", "6", "5"),
                  listOf("16", "15", "14", "13", "4", "3", "2", "1", "8", "7", "6", "5", "12", "11", "10", "9")
            )),
            correctResult = false
      )




}

fun check(name: String, result: Boolean, correctResult: Boolean) {
      if(result == correctResult) {
            println("Passed- $name")
      } else {
            println("Failed- $name expected $correctResult but got $result")
      }
}
