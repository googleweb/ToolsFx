package me.leon.controller

import me.leon.ext.*
import me.leon.ext.crypto.ClassicalCryptoType
import tornadofx.*

class ClassicalController : Controller() {

    fun encrypt(
        raw: String,
        type: ClassicalCryptoType = ClassicalCryptoType.CAESAR,
        params: MutableMap<String, String>,
        isSingleLine: Boolean = false
    ) =
        catch({ "编码错误: $it" }) {
            if (isSingleLine) raw.lineAction2String { encrypt(it, type, params) }
            else encrypt(raw, type, params)
        }

    private fun encrypt(
        raw: String,
        type: ClassicalCryptoType = ClassicalCryptoType.CAESAR,
        params: MutableMap<String, String>
    ): String = if (raw.isEmpty()) "" else type.encrypt(raw, params)

    fun decrypt(
        encoded: String,
        type: ClassicalCryptoType = ClassicalCryptoType.CAESAR,
        params: MutableMap<String, String>,
        isSingleLine: Boolean = false
    ) =
        catch({ "解密错误: $it" }) {
            if (isSingleLine) encoded.lineAction2String { type.decrypt(it, params) }
            else type.decrypt(encoded, params)
        }
}
