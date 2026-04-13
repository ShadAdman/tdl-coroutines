/*
 * Copyright 2026 Georgii Ippolitov (g000sha256)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.g000sha256.tdl.dto

import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String

/**
 * Describes a style that can be used to compose a text.
 *
 * @property name Name of the style.
 * @property customEmojiId Identifier of the custom emoji corresponding to the style.
 * @property title Title of the style in the user application's language.
 */
public class TextCompositionStyle public constructor(
    public val name: String,
    public val customEmojiId: Long,
    public val title: String,
) {
    override fun equals(other: Any?): Boolean {
        if (other === this) {
            return true
        }
        if (other == null) {
            return false
        }
        if (other::class != this::class) {
            return false
        }
        other as TextCompositionStyle
        if (other.name != name) {
            return false
        }
        if (other.customEmojiId != customEmojiId) {
            return false
        }
        return other.title == title
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + name.hashCode()
        hashCode = 31 * hashCode + customEmojiId.hashCode()
        hashCode = 31 * hashCode + title.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("TextCompositionStyle")
            append("(")
            append("name=")
            append(name)
            append(", ")
            append("customEmojiId=")
            append(customEmojiId)
            append(", ")
            append("title=")
            append(title)
            append(")")
        }
    }
}
