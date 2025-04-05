package com.example.sudoku

import kotlin.math.sqrt


fun main() {

}



fun isSudokuValid(matrix: List<List<String>>):Boolean {
    val size = matrix.size

    return when {
        !isBoardFilled(matrix) -> false
        !isSizeOfBoardValid(matrix, size) -> false
        !isAllCellsValid(matrix, size) -> false
        !isAllRowsValid(matrix) -> false
        !isAllColumnsValid(matrix, size) -> false
        !isAllSubgridsValid(matrix, size) -> false
        else-> true

    }
}

// check if any list is empty list
fun isBoardFilled(matrix: List<List<String>>): Boolean{
    return !(matrix.isEmpty() || matrix.any { it.isEmpty() })
}


// check that sudoku size is square and 4x4, 9x9 or 16x16
fun isSizeOfBoardValid(matrix: List<List<String>>, size:Int): Boolean{
    return !(size !in listOf(4, 9, 16) || matrix.any { it.size != size })
}


// check that all numbers in sudoku is in range of 1 to size or dash
fun isAllCellsValid(matrix: List<List<String>>, size: Int): Boolean{

    matrix.forEach { list->
        list.forEach { number ->
            if(number.toIntOrNull() !in 1..size && number != "-") return false
        }
    }
    return true
}

fun isListValid(list: List<String>): Boolean {
    val seen = mutableSetOf<String>()
    for (num in list) {
        if(num.toIntOrNull() != null){
            if (!seen.add(num)) return false
        }
    }
    return true
}

// check validation of rows
fun isAllRowsValid(matrix: List<List<String>>):Boolean {
    matrix.forEach { list ->
        if(!isListValid(list)) return false
    }
    return true
}

// check validation of columns
fun isAllColumnsValid(matrix: List<List<String>>, size: Int): Boolean {
    for(col in 0 until size){
        val column = mutableListOf<String>()
        for(row in 0 until size){
            column.add(matrix[row][col])
        }
        if(!isListValid(column)) return false
    }
    return true
}

// check validation of subgrids
fun isAllSubgridsValid(matrix: List<List<String>>, size: Int): Boolean {
    val squareOfSize = sqrt(size.toDouble()).toInt()

    for (i in 0 until size step squareOfSize) {
        val subGrid = mutableListOf<String>()

        for (row in i until i+squareOfSize) {
            for (col in 0 until squareOfSize) {
                subGrid.add(matrix[row][col])
            }
        }
        if(!isListValid(subGrid)) return false
    }
    return true
}





