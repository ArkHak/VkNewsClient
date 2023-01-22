package ru.omysin.vknewsclientcourse.data.network

import retrofit2.http.GET
import retrofit2.http.Query
import ru.omysin.vknewsclientcourse.data.model.LikesCountResponseDto
import ru.omysin.vknewsclientcourse.data.model.NewsFeedResponseDto
import ru.omysin.vknewsclientcourse.data.model.comments.CommentsResponseDto

interface ApiService {

    @GET("newsfeed.getRecommended?v=5.131")
    suspend fun loadRecommendations(
        @Query("access_token") token: String,
    ): NewsFeedResponseDto

    @GET("newsfeed.getRecommended?v=5.131")
    suspend fun loadRecommendations(
        @Query("access_token") accessToken: String,
        @Query("start_from") startFrom: String,
    ): NewsFeedResponseDto

    @GET("likes.add?v=5.131&type=post")
    suspend fun addLike(
        @Query("access_token") accessToken: String,
        @Query("owner_id") ownerId: Long,
        @Query("item_id") postId: Long,
    ): LikesCountResponseDto

    @GET("likes.delete?v=5.131&type=post")
    suspend fun deleteLike(
        @Query("access_token") accessToken: String,
        @Query("owner_id") ownerId: Long,
        @Query("item_id") postId: Long,
    ): LikesCountResponseDto

    @GET("newsfeed.ignoreItem?v-5.131&type=wall")
    suspend fun ignorePost(
        @Query("access_token") accessToken: String,
        @Query("owner_id") ownerId: Long,
        @Query("item_id") postId: Long,
    )

    @GET("wall.getComments?v=5.131&extended=1&fields=photo_100")
    suspend fun getComments(
        @Query("access_token") accessToken: String,
        @Query("owner_id") ownerId: Long,
        @Query("post_id") postId: Long,
    ): CommentsResponseDto
}