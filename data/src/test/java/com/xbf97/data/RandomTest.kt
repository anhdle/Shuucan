package com.xbf97.data

import org.junit.Assert
import org.junit.Test

class RandomTest{
    @Test
    fun random_isCorrect() {
        val r = Random()
        Assert.assertEquals(r.hello(), "hello")
    }
}