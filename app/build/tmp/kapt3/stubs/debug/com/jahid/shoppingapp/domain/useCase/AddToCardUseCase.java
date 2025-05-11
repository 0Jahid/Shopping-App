package com.jahid.shoppingapp.domain.useCase;

import com.jahid.shoppingapp.common.ResultState;
import com.jahid.shoppingapp.domain.models.CartDataModel;
import com.jahid.shoppingapp.domain.repo.repo;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/jahid/shoppingapp/domain/useCase/AddToCardUseCase;", "", "repository", "Lcom/jahid/shoppingapp/domain/repo/repo;", "(Lcom/jahid/shoppingapp/domain/repo/repo;)V", "addToCart", "Lkotlinx/coroutines/flow/Flow;", "Lcom/jahid/shoppingapp/common/ResultState;", "", "cartDataModel", "Lcom/jahid/shoppingapp/domain/models/CartDataModel;", "app_debug"})
public final class AddToCardUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.jahid.shoppingapp.domain.repo.repo repository = null;
    
    @javax.inject.Inject()
    public AddToCardUseCase(@org.jetbrains.annotations.NotNull()
    com.jahid.shoppingapp.domain.repo.repo repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.jahid.shoppingapp.common.ResultState<java.lang.String>> addToCart(@org.jetbrains.annotations.NotNull()
    com.jahid.shoppingapp.domain.models.CartDataModel cartDataModel) {
        return null;
    }
}