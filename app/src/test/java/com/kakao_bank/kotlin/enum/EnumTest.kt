package com.kakao_bank.kotlin.enum

import org.junit.Test

/**
 * Created by ohyowan on 2018. 3. 15..
 */
class EnumTest {

    // type-safe enums
    @Test
    fun test() {
        println(Direction.valueOf("NORTH"))
        println(Direction.valueOf("NORTH").name)
        println(Direction.valueOf("NORTH").ordinal)
        enumValues<Direction>().forEach { println(it.name) }
        println(Direction.values().joinToString()) // Female, Male
    }
    enum class Direction {
        NORTH, SOUTH, WEST, EAST
    }

    //Initialization
    // 내부에 생성자나 함수를 추가하는 것은 자바와 동일
    @Test
    fun test2() {
        println(Color.BLUE.rgb())
    }

    enum class Color(val r: Int, val g: Int, val b: Int) {
        RED(255, 0, 0), ORANGE(255, 165, 0),
        YELLOW(255, 255, 0), GREEN(0, 255, 0), BLUE(0, 0, 255),
        INDIGO(75, 0, 130), VIOLET(238, 130, 238);

        fun rgb() = (r * 256 + g) * 256 + b
    }

    //Anonymous Classes
    @Test
    fun anonymousTest() {
        println(ProtocolState.WAITING.signal())
    }

    enum class ProtocolState {
        WAITING {
            override fun signal() = TALKING
        },

        TALKING {
            override fun signal() = WAITING
        };

        abstract fun signal(): ProtocolState
    }

    //Kotlin 1.1 이후 새롭게 접근가능
    @Test
    fun printAllTest() {
        printAllValues<Color>()
    }

    inline fun <reified T : Enum<T>> printAllValues() {
        print(enumValues<T>().joinToString { it.name })
    }

    // when에서도 다양하게 사용
    @Test
    fun whenTest() {
        val color = Color.BLUE
        when (color) {
            Color.RED -> "Richard"
            Color.ORANGE -> "Of"
            Color.YELLOW -> "York"
            Color.GREEN -> "Gave"
            Color.BLUE -> "Battle"
            Color.INDIGO -> "In"
            Color.VIOLET -> "Vain"
        }
        println(getWarmth(Color.RED))
    }

    fun getWarmth(color: Color) = when (color) {
        Color.RED, Color.ORANGE, Color.YELLOW -> "warm"
        Color.GREEN -> "neutral"
        Color.BLUE, Color.INDIGO, Color.VIOLET -> "cold"
    }
}