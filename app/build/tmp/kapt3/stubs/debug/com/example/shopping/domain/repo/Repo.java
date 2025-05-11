package com.example.shopping.domain.repo;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\t\u001a\u00020\nH&J\u001a\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00040\u0003H&J\u001a\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\f0\u00040\u0003H&J\u001a\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\f0\u00040\u0003H&J\u001a\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\f0\u00040\u0003H&J\u001a\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\f0\u00040\u0003H&J\u001a\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u00040\u0003H&J\u001a\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00040\u0003H&J\u001c\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\u00032\u0006\u0010\u0016\u001a\u00020\u0005H&J\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\u00032\u0006\u0010\u0016\u001a\u00020\u0005H&J\u001a\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\f0\u00040\u0003H&J\"\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\f0\u00040\u00032\u0006\u0010\u001a\u001a\u00020\u0005H&J\u001c\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00040\u00032\u0006\u0010\u001d\u001a\u00020\u0005H&J\u001c\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u001f\u001a\u00020 H&J\u001c\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u001f\u001a\u00020 H&J\u001c\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010#\u001a\u00020\u001cH&J\u001c\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010%\u001a\u00020&H&\u00a8\u0006\'"}, d2 = {"Lcom/example/shopping/domain/repo/Repo;", "", "addToCart", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/shopping/common/ResultState;", "", "cartDataModels", "Lcom/example/shopping/domain/models/CartDataModels;", "addtoFav", "productDataModels", "Lcom/example/shopping/domain/models/ProductDataModels;", "getAllCategories", "", "Lcom/example/shopping/domain/models/CategoryDataModels;", "getAllFav", "getAllProducts", "getAllSuggestedProducts", "getBanner", "Lcom/example/shopping/domain/models/BannerDataModels;", "getCart", "getCategoriesInLimited", "getCheckout", "productId", "getProductById", "getProductsInLimited", "getSpecificCategoryItems", "categoryName", "getuserById", "Lcom/example/shopping/domain/models/UserDataParent;", "uid", "loginUserWithEmailAndPassword", "userData", "Lcom/example/shopping/domain/models/UserData;", "registerUserWithEmailAndPassword", "upDateUserData", "userDataParent", "userProfileImage", "uri", "Landroid/net/Uri;", "app_debug"})
public abstract interface Repo {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.example.shopping.common.ResultState<java.lang.String>> registerUserWithEmailAndPassword(@org.jetbrains.annotations.NotNull
    com.example.shopping.domain.models.UserData userData);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.example.shopping.common.ResultState<java.lang.String>> loginUserWithEmailAndPassword(@org.jetbrains.annotations.NotNull
    com.example.shopping.domain.models.UserData userData);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.example.shopping.common.ResultState<com.example.shopping.domain.models.UserDataParent>> getuserById(@org.jetbrains.annotations.NotNull
    java.lang.String uid);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.example.shopping.common.ResultState<java.lang.String>> upDateUserData(@org.jetbrains.annotations.NotNull
    com.example.shopping.domain.models.UserDataParent userDataParent);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.example.shopping.common.ResultState<java.lang.String>> userProfileImage(@org.jetbrains.annotations.NotNull
    android.net.Uri uri);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.example.shopping.common.ResultState<java.util.List<com.example.shopping.domain.models.CategoryDataModels>>> getCategoriesInLimited();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.example.shopping.common.ResultState<java.util.List<com.example.shopping.domain.models.ProductDataModels>>> getProductsInLimited();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.example.shopping.common.ResultState<java.util.List<com.example.shopping.domain.models.ProductDataModels>>> getAllProducts();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.example.shopping.common.ResultState<com.example.shopping.domain.models.ProductDataModels>> getProductById(@org.jetbrains.annotations.NotNull
    java.lang.String productId);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.example.shopping.common.ResultState<java.lang.String>> addToCart(@org.jetbrains.annotations.NotNull
    com.example.shopping.domain.models.CartDataModels cartDataModels);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.example.shopping.common.ResultState<java.lang.String>> addtoFav(@org.jetbrains.annotations.NotNull
    com.example.shopping.domain.models.ProductDataModels productDataModels);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.example.shopping.common.ResultState<java.util.List<com.example.shopping.domain.models.ProductDataModels>>> getAllFav();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.example.shopping.common.ResultState<java.util.List<com.example.shopping.domain.models.CartDataModels>>> getCart();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.example.shopping.common.ResultState<java.util.List<com.example.shopping.domain.models.CategoryDataModels>>> getAllCategories();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.example.shopping.common.ResultState<com.example.shopping.domain.models.ProductDataModels>> getCheckout(@org.jetbrains.annotations.NotNull
    java.lang.String productId);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.example.shopping.common.ResultState<java.util.List<com.example.shopping.domain.models.BannerDataModels>>> getBanner();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.example.shopping.common.ResultState<java.util.List<com.example.shopping.domain.models.ProductDataModels>>> getSpecificCategoryItems(@org.jetbrains.annotations.NotNull
    java.lang.String categoryName);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.example.shopping.common.ResultState<java.util.List<com.example.shopping.domain.models.ProductDataModels>>> getAllSuggestedProducts();
}