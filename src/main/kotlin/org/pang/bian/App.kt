package org.pang.bian

fun pluralize(count: Int, singular: String, plural: String): String {
    return if (count == 1) singular else plural
}
