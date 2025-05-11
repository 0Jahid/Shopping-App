package com.jahid.shoppingapp.domain.repo;

import com.jahid.shoppingapp.common.ResultState;
import com.jahid.shoppingapp.domain.models.BannerDataModels;
import com.jahid.shoppingapp.domain.models.CartDataModel;
import com.jahid.shoppingapp.domain.models.CategoryDataModel;
import com.jahid.shoppingapp.domain.models.Product;
import com.jahid.shoppingapp.domain.models.UserData;
import com.jahid.shoppingapp.domain.models.UserDataParent;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\t\u001a\u00020\nH&J\u001a\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00040\u0003H&J\u001a\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\f0\u00040\u0003H&J\u001a\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\f0\u00040\u0003H&J\u001a\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\f0\u00040\u0003H&J\u001a\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\f0\u00040\u0003H&J\u001a\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u00040\u0003H&J\u001a\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00040\u0003H&J\u001c\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\u00032\u0006\u0010\u0016\u001a\u00020\u0005H&J\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\u00032\u0006\u0010\u0016\u001a\u00020\u0005H&J\u001a\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\f0\u00040\u0003H&J\"\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\f0\u00040\u00032\u0006\u0010\u001a\u001a\u00020\u0005H&J\u001c\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00040\u00032\u0006\u0010\u001d\u001a\u00020\u0005H&J\u001c\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u001f\u001a\u00020\u001cH&J\u001c\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u001f\u001a\u00020\u001cH&J\u001c\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\"\u001a\u00020#H&J\u001c\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010%\u001a\u00020&H&\u00a8\u0006\'"}, d2 = {"Lcom/jahid/shoppingapp/domain/repo/repo;", "", "addToCart", "Lkotlinx/coroutines/flow/Flow;", "Lcom/jahid/shoppingapp/common/ResultState;", "", "cartDataModel", "Lcom/jahid/shoppingapp/domain/models/CartDataModel;", "addToFav", "product", "Lcom/jahid/shoppingapp/domain/models/Product;", "getAllCategories", "", "Lcom/jahid/shoppingapp/domain/models/CategoryDataModel;", "getAllFav", "getAllProducts", "getAllSuggestedProduct", "getBanner", "Lcom/jahid/shoppingapp/domain/models/BannerDataModels;", "getCart", "getCategoriesInLimited", "getCheckOut", "productId", "getProductById", "getProductInLimited", "getSpecificCategory", "categoryName", "getUserById", "Lcom/jahid/shoppingapp/domain/models/UserData;", "userId", "loginUserWithEmailAndPassword", "userData", "registerUserWithEmailAndPassword", "updateUser", "userDataParent", "Lcom/jahid/shoppingapp/domain/models/UserDataParent;", "userProfileImage", "uri", "Lcoil3/Uri;", "app_debug"})
public abstract interface repo {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.jahid.shoppingapp.common.ResultState<java.lang.String>> registerUserWithEmailAndPassword(@org.jetbrains.annotations.NotNull()
    com.jahid.shoppingapp.domain.models.UserData userData);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.jahid.shoppingapp.common.ResultState<java.lang.String>> loginUserWithEmailAndPassword(@org.jetbrains.annotations.NotNull()
    com.jahid.shoppingapp.domain.models.UserData userData);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.jahid.shoppingapp.common.ResultState<com.jahid.shoppingapp.domain.models.UserData>> getUserById(@org.jetbrains.annotations.NotNull()
    java.lang.String userId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.jahid.shoppingapp.common.ResultState<java.lang.String>> updateUser(@org.jetbrains.annotations.NotNull()
    com.jahid.shoppingapp.domain.models.UserDataParent userDataParent);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.jahid.shoppingapp.common.ResultState<java.lang.String>> userProfileImage(@org.jetbrains.annotations.NotNull()
    coil3.Uri uri);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.jahid.shoppingapp.common.ResultState<java.util.List<com.jahid.shoppingapp.domain.models.CategoryDataModel>>> getCategoriesInLimited();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.jahid.shoppingapp.common.ResultState<java.util.List<com.jahid.shoppingapp.domain.models.Product>>> getProductInLimited();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.jahid.shoppingapp.common.ResultState<java.util.List<com.jahid.shoppingapp.domain.models.Product>>> getAllProducts();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.jahid.shoppingapp.common.ResultState<com.jahid.shoppingapp.domain.models.Product>> getProductById(@org.jetbrains.annotations.NotNull()
    java.lang.String productId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.jahid.shoppingapp.common.ResultState<java.lang.String>> addToCart(@org.jetbrains.annotations.NotNull()
    com.jahid.shoppingapp.domain.models.CartDataModel cartDataModel);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.jahid.shoppingapp.common.ResultState<java.lang.String>> addToFav(@org.jetbrains.annotations.NotNull()
    com.jahid.shoppingapp.domain.models.Product product);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.jahid.shoppingapp.common.ResultState<java.util.List<com.jahid.shoppingapp.domain.models.Product>>> getAllFav();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.jahid.shoppingapp.common.ResultState<java.util.List<com.jahid.shoppingapp.domain.models.CartDataModel>>> getCart();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.jahid.shoppingapp.common.ResultState<java.util.List<com.jahid.shoppingapp.domain.models.CategoryDataModel>>> getAllCategories();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.jahid.shoppingapp.common.ResultState<com.jahid.shoppingapp.domain.models.Product>> getCheckOut(@org.jetbrains.annotations.NotNull()
    java.lang.String productId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.jahid.shoppingapp.common.ResultState<java.util.List<com.jahid.shoppingapp.domain.models.BannerDataModels>>> getBanner();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.jahid.shoppingapp.common.ResultState<java.util.List<com.jahid.shoppingapp.domain.models.Product>>> getSpecificCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryName);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.jahid.shoppingapp.common.ResultState<java.util.List<com.jahid.shoppingapp.domain.models.Product>>> getAllSuggestedProduct();
}