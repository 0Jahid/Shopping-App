package com.jahid.shoppingapp.domain.useCase

import com.jahid.shoppingapp.common.ResultState
import com.jahid.shoppingapp.domain.models.CartDataModel
import com.jahid.shoppingapp.domain.repo.repo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AddToCardUseCase @Inject constructor(
    private val repository: repo
) {
    fun addToCart(cartDataModel: CartDataModel): Flow<ResultState<String>> {
        return repository.addToCart(cartDataModel)

    }
}