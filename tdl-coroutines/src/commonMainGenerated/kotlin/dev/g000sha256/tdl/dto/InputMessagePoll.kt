/*
 * Copyright 2025-2026 Georgii Ippolitov (g000sha256)
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
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * A message with a poll. Polls can't be sent to secret chats and channel direct messages chats. Polls can be sent to a private chat only if the chat is a chat with a bot or the Saved Messages chat.
 *
 * @property question Poll question; 1-255 characters (up to 300 characters for bots). Only custom emoji entities are allowed to be added and only by Premium users.
 * @property options List of poll answer options; 2-getOption(&quot;poll_answer_count_max&quot;) options.
 * @property description Poll description; pass null to use an empty description; 0-getOption(&quot;message_caption_length_max&quot;) characters.
 * @property isAnonymous True, if the poll voters are anonymous. Non-anonymous polls can't be sent or forwarded to channels.
 * @property allowsMultipleAnswers True, if multiple answer options can be chosen simultaneously.
 * @property allowsRevoting True, if the poll can be answered multiple times.
 * @property shuffleOptions True, if poll options must be shown in a fixed random order.
 * @property hideResultsUntilCloses True, if the poll results will appear only after the poll closes.
 * @property type Type of the poll.
 * @property openPeriod Amount of time the poll will be active after creation, in seconds; 0-getOption(&quot;poll_open_period_max&quot;); pass 0 if not specified.
 * @property closeDate Point in time (Unix timestamp) when the poll will automatically be closed; must be 0-getOption(&quot;poll_open_period_max&quot;) seconds in the future; pass 0 if not specified.
 * @property isClosed True, if the poll needs to be sent already closed; for bots only.
 */
public class InputMessagePoll public constructor(
    public val question: FormattedText,
    public val options: Array<InputPollOption>,
    public val description: FormattedText?,
    public val isAnonymous: Boolean,
    public val allowsMultipleAnswers: Boolean,
    public val allowsRevoting: Boolean,
    public val shuffleOptions: Boolean,
    public val hideResultsUntilCloses: Boolean,
    public val type: InputPollType,
    public val openPeriod: Int,
    public val closeDate: Int,
    public val isClosed: Boolean,
) : InputMessageContent() {
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
        other as InputMessagePoll
        if (other.question != question) {
            return false
        }
        val optionsEquals = other.options.contentDeepEquals(options)
        if (!optionsEquals) {
            return false
        }
        if (other.description != description) {
            return false
        }
        if (other.isAnonymous != isAnonymous) {
            return false
        }
        if (other.allowsMultipleAnswers != allowsMultipleAnswers) {
            return false
        }
        if (other.allowsRevoting != allowsRevoting) {
            return false
        }
        if (other.shuffleOptions != shuffleOptions) {
            return false
        }
        if (other.hideResultsUntilCloses != hideResultsUntilCloses) {
            return false
        }
        if (other.type != type) {
            return false
        }
        if (other.openPeriod != openPeriod) {
            return false
        }
        if (other.closeDate != closeDate) {
            return false
        }
        return other.isClosed == isClosed
    }

    override fun hashCode(): Int {
        var hashCode = this::class.hashCode()
        hashCode = 31 * hashCode + question.hashCode()
        hashCode = 31 * hashCode + options.contentDeepHashCode()
        hashCode = 31 * hashCode + description.hashCode()
        hashCode = 31 * hashCode + isAnonymous.hashCode()
        hashCode = 31 * hashCode + allowsMultipleAnswers.hashCode()
        hashCode = 31 * hashCode + allowsRevoting.hashCode()
        hashCode = 31 * hashCode + shuffleOptions.hashCode()
        hashCode = 31 * hashCode + hideResultsUntilCloses.hashCode()
        hashCode = 31 * hashCode + type.hashCode()
        hashCode = 31 * hashCode + openPeriod.hashCode()
        hashCode = 31 * hashCode + closeDate.hashCode()
        hashCode = 31 * hashCode + isClosed.hashCode()
        return hashCode
    }

    override fun toString(): String {
        return buildString {
            append("InputMessagePoll")
            append("(")
            append("question=")
            append(question)
            append(", ")
            append("options=")
            options
                .contentDeepToString()
                .also { append(it) }
            append(", ")
            append("description=")
            append(description)
            append(", ")
            append("isAnonymous=")
            append(isAnonymous)
            append(", ")
            append("allowsMultipleAnswers=")
            append(allowsMultipleAnswers)
            append(", ")
            append("allowsRevoting=")
            append(allowsRevoting)
            append(", ")
            append("shuffleOptions=")
            append(shuffleOptions)
            append(", ")
            append("hideResultsUntilCloses=")
            append(hideResultsUntilCloses)
            append(", ")
            append("type=")
            append(type)
            append(", ")
            append("openPeriod=")
            append(openPeriod)
            append(", ")
            append("closeDate=")
            append(closeDate)
            append(", ")
            append("isClosed=")
            append(isClosed)
            append(")")
        }
    }
}
