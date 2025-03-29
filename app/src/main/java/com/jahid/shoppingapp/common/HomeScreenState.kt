package com.jahid.shoppingapp.common

import com.jahid.shoppingapp.domain.models.Product

class HomeScreenState {
    var isLoading = false
    var isError = false
    var errorMessage: String? = null
    var products: List<Product>? = null
    var cartItems: List<Product>? = null
    var favItems: List<Product>? = null
    var isCartLoading = false
    var isFavLoading = false
    var isCartError = false
    var isFavError = false
    var cartErrorMessage: String? = null
    var favErrorMessage: String? = null
    var isCartEmpty = false
    var isFavEmpty = false
    var isCartSuccess = false
    var isFavSuccess = false
    var isCartDeleted = false
    var isFavDeleted = false
    var isCartUpdated = false
    var isFavUpdated = false
    var isCartAdded = false
    var isFavAdded = false
    var isCartLoadingMore = false
    var isFavLoadingMore = false
    var isCartRefreshing = false
    var isFavRefreshing = false
    var isCartLoadMoreError = false
    var isFavLoadMoreError = false
    var cartLoadMoreErrorMessage: String? = null
    var favLoadMoreErrorMessage: String? = null
    var isCartLoadMoreEmpty = false
    var isFavLoadMoreEmpty = false
    var isCartLoadMoreSuccess = false
    var isFavLoadMoreSuccess = false
    var isCartLoadMoreDeleted = false
    var isFavLoadMoreDeleted = false
    var isCartLoadMoreUpdated = false
    var isFavLoadMoreUpdated = false
    var isCartLoadMoreAdded = false
    var isFavLoadMoreAdded = false
    var isCartRefreshingMore = false
    var isFavRefreshingMore = false
    var isCartRefreshError = false
    var isFavRefreshError = false
    var cartRefreshErrorMessage: String? = null
    var favRefreshErrorMessage: String? = null
    var isCartRefreshEmpty = false
    var isFavRefreshEmpty = false
    var isCartRefreshSuccess = false
    var isFavRefreshSuccess = false
    var isCartRefreshDeleted = false
    var isFavRefreshDeleted = false
}