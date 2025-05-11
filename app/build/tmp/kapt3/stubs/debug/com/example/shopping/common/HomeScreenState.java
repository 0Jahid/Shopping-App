package com.example.shopping.common;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u00c6\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007H\u00c6\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007H\u00c6\u0003JU\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0005H\u00d6\u0001R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0013R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f\u00a8\u0006 "}, d2 = {"Lcom/example/shopping/common/HomeScreenState;", "", "isLoading", "", "errorMessage", "", "categories", "", "Lcom/example/shopping/domain/models/CategoryDataModels;", "products", "Lcom/example/shopping/domain/models/ProductDataModels;", "banners", "Lcom/example/shopping/domain/models/BannerDataModels;", "(ZLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getBanners", "()Ljava/util/List;", "getCategories", "getErrorMessage", "()Ljava/lang/String;", "()Z", "getProducts", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class HomeScreenState {
    private final boolean isLoading = false;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String errorMessage = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.example.shopping.domain.models.CategoryDataModels> categories = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.example.shopping.domain.models.ProductDataModels> products = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.example.shopping.domain.models.BannerDataModels> banners = null;
    
    public HomeScreenState(boolean isLoading, @org.jetbrains.annotations.Nullable
    java.lang.String errorMessage, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.shopping.domain.models.CategoryDataModels> categories, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.shopping.domain.models.ProductDataModels> products, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.shopping.domain.models.BannerDataModels> banners) {
        super();
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.shopping.domain.models.CategoryDataModels> getCategories() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.shopping.domain.models.ProductDataModels> getProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.shopping.domain.models.BannerDataModels> getBanners() {
        return null;
    }
    
    public HomeScreenState() {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.shopping.domain.models.CategoryDataModels> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.shopping.domain.models.ProductDataModels> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.shopping.domain.models.BannerDataModels> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.shopping.common.HomeScreenState copy(boolean isLoading, @org.jetbrains.annotations.Nullable
    java.lang.String errorMessage, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.shopping.domain.models.CategoryDataModels> categories, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.shopping.domain.models.ProductDataModels> products, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.shopping.domain.models.BannerDataModels> banners) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}