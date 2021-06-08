package com.example.marvelcleanmvvm.framework.data.server.response

import java.util.*

data class BaseResponse<T> (
    var code: Int? = null,
    var status: String? = null,
    var data: T? = null
)

data class MarvelCharacterResponse(
    val offset: Int? = null,
    val limit: Int? = null,
    val total: Int? = null,
    val count: Int? = null,
    val results: List<CharacterResponse>? = null
)

data class CharacterResponse(
    val id: Int? = null,
    val name: String? = null,
    val description: String? = null,
    val modified: Date? = null,
    val resourceURI: String? = null,
    val urls: List<UrlResponse>? = null,
    val thumbnail: ThumbnailResponse? = null,
    val comics: ComicsResponse? = null,
    val stories: StoriesResponse? = null,
    val events: EventsResponse? = null,
    val series: SeriesResponse? = null
)

data class UrlResponse(
    val type: String? = null,
    val url: String? = null
)

data class ThumbnailResponse(
    val path: String? = null,
    val extension: String? = null
)

data class ComicsResponse(
    val available: Int? = null,
    val returned: Int? = null,
    val collectionURI: String? = null,
    val items: List<ItemResponse>? = null
)

data class StoriesResponse(
    val available: Int? = null,
    val returned: Int? = null,
    val collectionURI: String? = null,
    val items: List<ItemResponse>? = null
)

data class EventsResponse(
    val available: Int? = null,
    val returned: Int? = null,
    val collectionURI: String? = null,
    val items: List<ItemResponse>? = null
)

data class SeriesResponse(
    val available: Int? = null,
    val returned: Int? = null,
    val collectionURI: String? = null,
    val items: List<ItemResponse>? = null
)

data class ItemResponse(
    val resourceURI: String? = null,
    val name: String? = null
)




