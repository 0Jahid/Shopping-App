package com.jahid.shoppingapp.domain.repo

import coil3.Uri
import com.jahid.shoppingapp.common.ResultState
import com.jahid.shoppingapp.domain.models.BannerDataModels
import com.jahid.shoppingapp.domain.models.CartDataModel
import com.jahid.shoppingapp.domain.models.CategoryDataModel
import com.jahid.shoppingapp.domain.models.Product
import com.jahid.shoppingapp.domain.models.UserData
import com.jahid.shoppingapp.domain.models.UserDataParent
import kotlinx.coroutines.flow.Flow

interface repo {
    fun registerUserWithEmailAndPassword(userData: UserData): Flow<ResultState<String>>
    fun loginUserWithEmailAndPassword(userData: UserData): Flow<ResultState<String>>
    fun getUserById(userId: String): Flow<ResultState<UserData>>
    fun updateUser(userDataParent: UserDataParent): Flow<ResultState<String>>
    fun userProfileImage(uri: Uri): Flow<ResultState<String>>
    fun getCategoriesInLimited(): Flow<ResultState<List<CategoryDataModel>>>
    fun getProductInLimited(): Flow<ResultState<List<Product>>>
    fun getAllProducts(): Flow<ResultState<List<Product>>>
    fun getProductById(productId: String): Flow<ResultState<Product>>
    fun addToCart(cartDataModel: CartDataModel): Flow<ResultState<String>>
    fun addToFav(product: Product): Flow<ResultState<String>>
    fun getAllFav(): Flow<ResultState<List<Product>>>
    fun getCart(): Flow<ResultState<List<CartDataModel>>>
    fun getAllCategories(): Flow<ResultState<List<CategoryDataModel>>>
    fun getCheckOut(productId: String): Flow<ResultState<Product>>
    fun getBanner(): Flow<ResultState<List<BannerDataModels>>>
    fun getSpecificCategory(categoryName: String): Flow<ResultState<List<Product>>>
    fun getAllSuggestedProduct(): Flow<ResultState<List<Product>>>


}