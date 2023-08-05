package com.oyelabs.marvel.universe.utils

import java.math.BigInteger
import java.security.MessageDigest
import java.sql.Timestamp

class Constants {
    companion object {
        const val BASE_URL = "https://gateway.marvel.com/"
        val timeStamp = Timestamp(System.currentTimeMillis()).time.toString()
        const val API_KEY = "c6ccfe53baae7a3955ce5f8549ff850a"
        const val PRIVATE_KEY = "523eb7817196be2d1d571f9d679f3821db78a7aa"
        const val limit = "20"
        fun hash(): String {
            val input = "$timeStamp$PRIVATE_KEY$API_KEY"
            val md = MessageDigest.getInstance("MD5")
            return BigInteger(1,md.digest(input.toByteArray())).toString(16).padStart(32,'0')
        }
    }
}
