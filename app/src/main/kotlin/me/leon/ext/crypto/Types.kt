package me.leon.ext.crypto

val encodeTypeMap = EncodeType.values().sortedBy { it.type.lowercase() }.associateBy { it.type }

fun String.encodeType() = encodeTypeMap[this] ?: EncodeType.Base64

val classicalTypeMap =
    ClassicalCryptoType.values().sortedBy { it.type.lowercase() }.associateBy { it.type }

fun String.classicalType() = classicalTypeMap[this] ?: ClassicalCryptoType.CAESAR

val passwordHashingTypeMap =
    PasswordHashingType.values().sortedBy { it.name.lowercase() }.associateBy { it.name }

val passwordHashingTypes = PasswordHashingType.values().map { it.name }.sortedBy { it.lowercase() }

fun String.passwordHashingType() = passwordHashingTypeMap[this]

val calculatorType = Calculator.values().associateBy { it.algo }

fun String.calculatorType() = calculatorType[this]
