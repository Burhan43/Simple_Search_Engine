package search

import java.io.File
import java.util.*
import kotlin.system.exitProcess


//class Search(args: Array<String>) {
//    private val data: List<String>
//    private val invertedIndex = mutableMapOf<String, MutableSet<Int>>()
//    private val queryMap = mutableMapOf<String, MutableSet<Int>>()
//
//    init {
//        val file = File(args[1])
//        data = file.readLines()
//        data.forEachIndexed { index, string ->
//            string
//                .uppercase(Locale.getDefault())
//                .split(" ")
//                .forEach {
//                    if (invertedIndex[it] == null)
//                        invertedIndex[it] = mutableSetOf(index)
//                    else
//                        invertedIndex[it]!!.add(index)
//                }
//        }
//        menu()
//    }
//
//    private fun menu() {
//        while (true) {
//            println("\n=== Menu ===\n1. Search information.\n2. Print all data.\n0. Exit.")
//            when (readLine()!!) {
//                "1" -> findPerson()
//                "2" -> printAll()
//                "0" -> break
//                else -> println("Incorrect option! Try again.")
//            }
//
//
//        }
//        println("Bye!")
//    }
//
//    private fun findPerson() {
//
//        println("Select a matching strategy: ALL, ANY, NONE")
//
//
//
//        println("Enter a name or email to search all suitable people.")
//        val query = readLine()!!.uppercase(Locale.getDefault())
//           query .forEachIndexed { index, string ->
//                string
//                    .uppercase(Locale.getDefault())
//                    .split(" ")
//                    .forEach {
//                        if (queryMap[it] == null)
//                            queryMap[it] = mutableSetOf(index)
//                        else
//                            queryMap[it]!!.add(index)
//                    }
//            }
//        if (invertedIndex[query] == null) println("No matching people found.") else {
//
//            when(val advancedQuery= readLine()!!.toString()){
//                "ANY" -> {
//
//
//
//
//                    val filteredKeysMap = invertedIndex.filterKeys { it.contains(queryMap.keys.iterator().next()) }
//
//
//                }
//
//                "ALL" -> {
//
//                    println("${invertedIndex[query]!!.size} persons found:")
//                    invertedIndex[query]!!
//                        .joinToString("\n") { data[it] }
//                        .let(::println)
//
//
//                }
//
//                "NONE" -> {
//
//                }
//
//
//            }
////            println("${invertedIndex[query]!!.size} persons found:")
////            invertedIndex[query]!!
////                .joinToString("\n") { data[it] }
////                .let(::println)
//        }
//    }
//
//    private fun printAll() {
//        println("=== List of people ===")
//        data.forEach { println(it) }
//    }
//}
//
//fun main(args: Array<String>) {
//    Search(args)
//}
//
////fun main(args: Array<String>) {
//////    stage2()
//////    stage3()
////fun printMenu() = println("""
////    === Menu ===
////    1. Find an entry
////    2. Print all entries
////    0. Exit
////""".trimIndent())
////    val entries = File(args[1]).readLines()
////    while (true) {
////        printMenu()
////        when (readLine()) {
////            "1" -> find(entries)
////            "2" -> entries.forEach(::println)
////            "0" -> break
////            else -> println("Incorrect option! Try again.")
////        }
////    }
////    println("Bye")
////}
//
//
//
//
//fun stage2() {
//    println("Enter the number of people:")
//    val noOfRecords = readLine()!!.toInt()
//    println("Enter all people:")
////    val listOfRecords = MutableList(noOfRecords) { readLine()!!.toString().lowercase(Locale.getDefault()) }
//    val listOfRecords = MutableList(noOfRecords) { readLine()!!.toString() }
//    println("Enter the number of search queries:")
//    val noQueries = readLine()!!.toInt()
//    repeat(noQueries) {
//        println("Enter data to search people:")
//        val toSearch = readLine()!!.toString().lowercase(Locale.getDefault())
//        val filteredResults =
//            listOfRecords.filter { it.lowercase(Locale.getDefault()).contains(toSearch) }.toString().replace("[", "").replace("]", "")
//                .replace(", ", "\n").trim()
//        println(
//            if (filteredResults.isEmpty()) {
//                "No matching people found."
//            } else {
//                "People found:\n$filteredResults"
//            }
//        )
//    }
//}
//fun stage3() {
//    var inputMenu = -1
//    println("Enter the number of people:")
//    val noOfRecords = readLine()!!.toInt()
//    println("Enter all people:")
//    val listOfRecords = MutableList(noOfRecords) { readLine()!!.toString() }
//
//    while (inputMenu != 0) {
//        println(
//            "=== Menu ===\n" +
//                    "1. Find a person\n" +
//                    "2. Print all people\n" +
//                    "0. Exit"
//        )
//
//        inputMenu = readLine()!!.toInt()
//        when (inputMenu) {
//            0 -> {
//                println("Bye!")
//                exitProcess(-1)
//            }
//            1 -> findPerson(listOfRecords)
//            2 -> allPeople(listOfRecords)
//            else -> { // Note the block
//                print("Incorrect option! Try again.")
//            }
//        }
//    }
//
//
//}
//
//fun findPerson(listOfRecords: MutableList<String>) {
////    println("Enter the number of search queries:")
////    val noQueries = readLine()!!.toInt()
////    repeat(noQueries) {
//    println("Enter a name or email to search all suitable people.")
//    val toSearch = readLine()!!.toString().lowercase(Locale.getDefault())
//    val filteredResults =
//        listOfRecords.filter { it.lowercase(Locale.getDefault()).contains(toSearch) }.toString()
//            .replace("[", "").replace("]", "").replace(", ", "\n").trim()
//    println(
//        if (filteredResults.isEmpty()) {
//            "No matching people found."
//        } else {
//            "People found:\n$filteredResults"
//        }
//    )
////    }
//}
//
//fun allPeople(listOfRecords: MutableList<String>) {
////    println("Enter the number of search queries:")
////    val noQueries = readLine()!!.toInt()
////    repeat(noQueries) {
//    println("=== List of people ===")
//
//    val filteredResults =
//        listOfRecords.toString()
//            .replace("[", "").replace("]", "").replace(", ", "\n").trim()
//    println(filteredResults)
////    }
//}
//
//
//
//
//
//
//    fun find(entries: List<String>) {
//        println("Enter a query to find entries.")
//        val query = readLine()!!
//        entries.filter { it.contains(query, ignoreCase = true) }
//            .forEach(::println)
//    }


fun main(args: Array<String>) {
    if (args.size != 2 || args[0] != "--data") {
        println("usage: <script> --data <filename>")
        exitProcess(1)
    }

    val filename = args[1]
    val people = File(filename).readLines()
    val index = buildInvertedIndex(people)

    do {
        printMenu()
        val choice = readLine()!!.toInt()

        when (choice) {
            0 -> break
            1 -> find(people, index)
            2 -> print(people)
            else -> println("Incorrect option! Try again.")
        }
    } while (true)

    println("Bye!")
}

fun buildInvertedIndex(lines: List<String>): Map<String, Set<Int>> {
    val index = mutableMapOf<String, MutableSet<Int>>()
    for (line in lines.withIndex()) {
        val parts = line.value.split(" ")
        for (part in parts) {
            val list = index.getOrDefault(part.toLowerCase(), mutableSetOf())
            list.add(line.index)
            index[part.toLowerCase()] = list
        }
    }
    return index
}

fun printMenu() {
    println("=== Menu ===")
    println("1. Find a person")
    println("2. Print all people")
    println("0. Exit")
}

fun find(people: List<String>, index: Map<String, Set<Int>>) {
    val strategy = getStrategy()

    println("Enter a name or email to search all suitable people.")
    val queryParts = readLine()!!.split(" ")

    val matchesInIndex = when (strategy) {
        "ALL" -> {
            queryParts.map { getFromIndex(index, it) }.reduce { acc, set -> acc.intersect(set).toMutableSet() }
        }
        "ANY" -> {
            queryParts.map { getFromIndex(index, it) }.reduce { acc, set -> acc.union(set).toMutableSet() }
        }
        "NONE" -> {
            var allLines = people.indices.toMutableSet()
            for (query in queryParts) {
                allLines = allLines.minus(getFromIndex(index, query)).toMutableSet()
            }
            allLines
        }
        else -> emptySet()
    }

    if (matchesInIndex.isNotEmpty()) {
        matchesInIndex.forEach { println(people[it]) }
    } else {
        println("No matching people found.")
    }
}

fun getFromIndex(index: Map<String, Set<Int>>, query: String): Set<Int> {
    return index[query.toLowerCase()] ?: emptySet()
}

fun getStrategy(): String {
    while (true) {
        println("Select a matching strategy: ALL, ANY, NONE")

        val strategy = readLine()!!
        if (strategy in listOf("ALL", "ANY", "NONE")) {
            return strategy
        }
    }
}

fun print(people: List<String>) {
    println("=== List of people ===")
    people.forEach { println(it) }
}
