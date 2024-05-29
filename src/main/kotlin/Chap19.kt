package org.example

import kotlin.time.measureTime

fun main(args: Array<String>) {
    run {
        println("----19.1----")
        val map: Map<String, String> = mapOf(
            "pen" to "ペン",
            "Apple" to "アップル",
            "Pineapple" to "パイナップル"
        )
        val value1 = map["Pen"]
        val value2 = map["Pineapple"]
        val value3 = map["Apple"]
        val value4 = map["Pen"]
        println("$value1,$value2,$value3,$value4")
    }
    run {
        println("----19.2----")
        val map: Map<Char, Int> = mapOf(
            'a' to 1,
            'b' to 2,
            'c' to 3,
            'z' to 26,
        )
        println(map['a'])
        println(map['b'])
        println(map['c'])
        println(map['z'])
    }
    run {
        println("----19.5----")
        val map = mutableMapOf("Pen" to "ペン")
        map.put("Apple", "アップル")
        map += "Pinapple" to "パイナップル"
        val value1 = map["Pen"]
        val value2 = map["Pineapple"]
        val value3 = map["Apple"]
        map -= "Pen"
        val value4 = map["Pen"]
        println("$value1,$value2,$value3,$value4")
    }
}