package ru.omysin.vknewsclientcourse.presentation.comments

import ru.omysin.vknewsclientcourse.domain.FeedPost
import ru.omysin.vknewsclientcourse.domain.PostComment

sealed class CommentsScreenState {
    object Initial : CommentsScreenState()
    data class Comments(
        val feedPost: FeedPost,
        val comments: List<PostComment>,
    ) : CommentsScreenState()
}
