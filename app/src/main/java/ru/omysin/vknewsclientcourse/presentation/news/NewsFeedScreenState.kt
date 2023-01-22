package ru.omysin.vknewsclientcourse.presentation.news

import ru.omysin.vknewsclientcourse.domain.FeedPost

sealed class NewsFeedScreenState {
    object Initial : NewsFeedScreenState()

    object Loading: NewsFeedScreenState()

    data class Posts(
        val posts: List<FeedPost>,
        val nextDataIsLoading: Boolean = false,
    ) : NewsFeedScreenState()
}
