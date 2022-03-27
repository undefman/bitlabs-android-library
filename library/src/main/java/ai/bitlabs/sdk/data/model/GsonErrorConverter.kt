package ai.bitlabs.sdk.data.model

import com.google.gson.GsonBuilder
import okhttp3.ResponseBody

/**
 * Returns a [BitLabsResponse] object converted from JSON.
 * @receiver The [error body][ResponseBody] of a response that received a status code in 400..500
 */
internal fun ResponseBody.body(): BitLabsResponse? =
    try {
        GsonBuilder().create().fromJson(this.string(), BitLabsResponse::class.java)
    } catch (e: Exception) {
        null
    }