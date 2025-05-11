package com.example.shopping.presentation.viewModels;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0098\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0097\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u00a2\u0006\u0002\u0010&J\u000e\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u00020mJ\u000e\u0010n\u001a\u00020k2\u0006\u0010o\u001a\u00020pJ\u000e\u0010q\u001a\u00020k2\u0006\u0010r\u001a\u00020sJ\u0006\u0010t\u001a\u00020kJ\u0006\u0010u\u001a\u00020kJ\u0006\u0010v\u001a\u00020kJ\u0006\u0010w\u001a\u00020kJ\u0006\u0010x\u001a\u00020kJ\u000e\u0010y\u001a\u00020k2\u0006\u0010z\u001a\u00020{J\u000e\u0010\u0012\u001a\u00020k2\u0006\u0010z\u001a\u00020{J\u000e\u0010\"\u001a\u00020k2\u0006\u0010|\u001a\u00020{J\u000e\u0010}\u001a\u00020k2\u0006\u0010~\u001a\u00020{J\u0006\u0010\u007f\u001a\u00020kJ\u000f\u0010\u0080\u0001\u001a\u00020k2\u0006\u0010r\u001a\u00020sJ\u0011\u0010\u0081\u0001\u001a\u00020k2\b\u0010\u0082\u0001\u001a\u00030\u0083\u0001J\u0011\u0010\u0084\u0001\u001a\u00020k2\b\u0010\u0085\u0001\u001a\u00030\u0086\u0001R\u0014\u0010\'\u001a\b\u0012\u0004\u0012\u00020)0(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020+0(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020-0(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020/0(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u00100\u001a\b\u0012\u0004\u0012\u0002010(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u00102\u001a\b\u0012\u0004\u0012\u0002030(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u00104\u001a\b\u0012\u0004\u0012\u0002050(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u00106\u001a\b\u0012\u0004\u0012\u0002070(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u00108\u001a\b\u0012\u0004\u0012\u0002090(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010:\u001a\b\u0012\u0004\u0012\u00020;0(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020=0(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010>\u001a\b\u0012\u0004\u0012\u00020?0(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010@\u001a\b\u0012\u0004\u0012\u00020A0(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010B\u001a\b\u0012\u0004\u0012\u00020C0(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010D\u001a\b\u0012\u0004\u0012\u00020E0(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010F\u001a\b\u0012\u0004\u0012\u00020G0(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020)0I\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010L\u001a\b\u0012\u0004\u0012\u00020+0I\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010KR\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010N\u001a\b\u0012\u0004\u0012\u00020-0I\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010KR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010P\u001a\b\u0012\u0004\u0012\u00020/0I\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010KR\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010R\u001a\b\u0012\u0004\u0012\u0002010I\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u0010KR\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010T\u001a\b\u0012\u0004\u0012\u0002030I\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u0010KR\u000e\u0010$\u001a\u00020%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010V\u001a\b\u0012\u0004\u0012\u0002050I\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010KR\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010X\u001a\b\u0012\u0004\u0012\u0002070I\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u0010KR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010Z\u001a\b\u0012\u0004\u0012\u0002090I\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u0010KR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\\\u001a\b\u0012\u0004\u0012\u00020;0I\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u0010KR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010^\u001a\b\u0012\u0004\u0012\u00020=0I\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u0010KR\u0017\u0010`\u001a\b\u0012\u0004\u0012\u00020?0I\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u0010KR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010b\u001a\b\u0012\u0004\u0012\u00020A0I\u00a2\u0006\b\n\u0000\u001a\u0004\bc\u0010KR\u0017\u0010d\u001a\b\u0012\u0004\u0012\u00020C0I\u00a2\u0006\b\n\u0000\u001a\u0004\be\u0010KR\u0017\u0010f\u001a\b\u0012\u0004\u0012\u00020E0I\u00a2\u0006\b\n\u0000\u001a\u0004\bg\u0010KR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010h\u001a\b\u0012\u0004\u0012\u00020G0I\u00a2\u0006\b\n\u0000\u001a\u0004\bi\u0010KR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0087\u0001"}, d2 = {"Lcom/example/shopping/presentation/viewModels/ShoppingAppViewModel;", "Landroidx/lifecycle/ViewModel;", "createUserUseCase", "Lcom/example/shopping/domain/useCase/CreateUserUseCase;", "loginUserUseCase", "Lcom/example/shopping/domain/useCase/LoginUserUseCase;", "getUserUseCase", "Lcom/example/shopping/domain/useCase/GetUserUseCase;", "upDateUserDataUseCase", "Lcom/example/shopping/domain/useCase/UpDateUserDataUseCase;", "userProfileImageUseCase", "Lcom/example/shopping/domain/useCase/userProfileImageUseCase;", "getCategoryInLimit", "Lcom/example/shopping/domain/useCase/getCategoryInLimit;", "getProductsInLimitUseCase", "Lcom/example/shopping/domain/useCase/getProductsInLimitUseCase;", "addtoCardUseCase", "Lcom/example/shopping/domain/useCase/AddtoCardUseCase;", "getProductByID", "Lcom/example/shopping/domain/useCase/getProductByID;", "addtoFavUseCase", "Lcom/example/shopping/domain/useCase/AddToFavUseCase;", "getAllFavUseCase", "Lcom/example/shopping/domain/useCase/GetAllFavUseCase;", "getAllProductsUseCase", "Lcom/example/shopping/domain/useCase/GetAllProductUseCase;", "getCartUseCase", "Lcom/example/shopping/domain/useCase/GetCartUseCase;", "getAllCategoriesUseCase", "Lcom/example/shopping/domain/useCase/GetAllCategoriesUseCase;", "getCheckOutUseCase", "Lcom/example/shopping/domain/useCase/GetCheckOutUseCase;", "getBannerUseCase", "Lcom/example/shopping/domain/useCase/GetBannerUseCase;", "getSpecifiCategoryItems", "Lcom/example/shopping/domain/useCase/GetSpecifiCategoryItems;", "getAllSuggestedProductsUseCase", "Lcom/example/shopping/domain/useCase/GetAllSuggestedProductsUseCase;", "(Lcom/example/shopping/domain/useCase/CreateUserUseCase;Lcom/example/shopping/domain/useCase/LoginUserUseCase;Lcom/example/shopping/domain/useCase/GetUserUseCase;Lcom/example/shopping/domain/useCase/UpDateUserDataUseCase;Lcom/example/shopping/domain/useCase/userProfileImageUseCase;Lcom/example/shopping/domain/useCase/getCategoryInLimit;Lcom/example/shopping/domain/useCase/getProductsInLimitUseCase;Lcom/example/shopping/domain/useCase/AddtoCardUseCase;Lcom/example/shopping/domain/useCase/getProductByID;Lcom/example/shopping/domain/useCase/AddToFavUseCase;Lcom/example/shopping/domain/useCase/GetAllFavUseCase;Lcom/example/shopping/domain/useCase/GetAllProductUseCase;Lcom/example/shopping/domain/useCase/GetCartUseCase;Lcom/example/shopping/domain/useCase/GetAllCategoriesUseCase;Lcom/example/shopping/domain/useCase/GetCheckOutUseCase;Lcom/example/shopping/domain/useCase/GetBannerUseCase;Lcom/example/shopping/domain/useCase/GetSpecifiCategoryItems;Lcom/example/shopping/domain/useCase/GetAllSuggestedProductsUseCase;)V", "_addToCartState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/shopping/presentation/viewModels/AddtoCardState;", "_addtoFavState", "Lcom/example/shopping/presentation/viewModels/AddtoFavState;", "_getAllCategoriesState", "Lcom/example/shopping/presentation/viewModels/GetAllCategoriesState;", "_getAllFavState", "Lcom/example/shopping/presentation/viewModels/GetAllFavState;", "_getAllProductsState", "Lcom/example/shopping/presentation/viewModels/GetAllProductsState;", "_getAllSuggestedProductsState", "Lcom/example/shopping/presentation/viewModels/GetAllSuggestedProductsState;", "_getCartState", "Lcom/example/shopping/presentation/viewModels/GetCartsState;", "_getCheckOutState", "Lcom/example/shopping/presentation/viewModels/GetCheckOutState;", "_getProductByIDState", "Lcom/example/shopping/presentation/viewModels/GetProductByIDState;", "_getSpecifiCategoryItemsState", "Lcom/example/shopping/presentation/viewModels/GetSpecifiCategoryItemsState;", "_homeScreenState", "Lcom/example/shopping/common/HomeScreenState;", "_loginScreenState", "Lcom/example/shopping/presentation/viewModels/LoginScreenState;", "_profileScreenState", "Lcom/example/shopping/presentation/viewModels/ProfileScreenState;", "_singUpScreenState", "Lcom/example/shopping/presentation/viewModels/SignUpScreenState;", "_upDateScreenState", "Lcom/example/shopping/presentation/viewModels/UpDateScreenState;", "_userProfileImageState", "Lcom/example/shopping/presentation/viewModels/uploadUserProfileImageState;", "addToCartState", "Lkotlinx/coroutines/flow/StateFlow;", "getAddToCartState", "()Lkotlinx/coroutines/flow/StateFlow;", "addtoFavState", "getAddtoFavState", "getAllCategoriesState", "getGetAllCategoriesState", "getAllFavState", "getGetAllFavState", "getAllProductsState", "getGetAllProductsState", "getAllSuggestedProductsState", "getGetAllSuggestedProductsState", "getCartState", "getGetCartState", "getCheckOutState", "getGetCheckOutState", "getProductByIDState", "getGetProductByIDState", "getSpecifiCategoryItemsState", "getGetSpecifiCategoryItemsState", "homeScreenState", "getHomeScreenState", "loginScreenState", "getLoginScreenState", "profileScreenState", "getProfileScreenState", "singUpScreenState", "getSingUpScreenState", "upDateScreenState", "getUpDateScreenState", "userProfileImageState", "getUserProfileImageState", "addToCart", "", "cartDataModels", "Lcom/example/shopping/domain/models/CartDataModels;", "addToFav", "productDataModels", "Lcom/example/shopping/domain/models/ProductDataModels;", "createUser", "userData", "Lcom/example/shopping/domain/models/UserData;", "getAllCategories", "getAllFav", "getAllProducts", "getAllSuggestedProducts", "getCart", "getCheckOut", "productId", "", "categoryName", "getUserById", "uid", "loadHomeScreenData", "loginUser", "upDateUserData", "userDataParent", "Lcom/example/shopping/domain/models/UserDataParent;", "upLoadUserProfileImage", "uri", "Landroid/net/Uri;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class ShoppingAppViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.shopping.domain.useCase.CreateUserUseCase createUserUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.shopping.domain.useCase.LoginUserUseCase loginUserUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.shopping.domain.useCase.GetUserUseCase getUserUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.shopping.domain.useCase.UpDateUserDataUseCase upDateUserDataUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.shopping.domain.useCase.userProfileImageUseCase userProfileImageUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.shopping.domain.useCase.getCategoryInLimit getCategoryInLimit = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.shopping.domain.useCase.getProductsInLimitUseCase getProductsInLimitUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.shopping.domain.useCase.AddtoCardUseCase addtoCardUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.shopping.domain.useCase.getProductByID getProductByID = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.shopping.domain.useCase.AddToFavUseCase addtoFavUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.shopping.domain.useCase.GetAllFavUseCase getAllFavUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.shopping.domain.useCase.GetAllProductUseCase getAllProductsUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.shopping.domain.useCase.GetCartUseCase getCartUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.shopping.domain.useCase.GetAllCategoriesUseCase getAllCategoriesUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.shopping.domain.useCase.GetCheckOutUseCase getCheckOutUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.shopping.domain.useCase.GetBannerUseCase getBannerUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.shopping.domain.useCase.GetSpecifiCategoryItems getSpecifiCategoryItems = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.shopping.domain.useCase.GetAllSuggestedProductsUseCase getAllSuggestedProductsUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.shopping.presentation.viewModels.SignUpScreenState> _singUpScreenState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.example.shopping.presentation.viewModels.SignUpScreenState> singUpScreenState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.shopping.presentation.viewModels.LoginScreenState> _loginScreenState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.example.shopping.presentation.viewModels.LoginScreenState> loginScreenState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.shopping.presentation.viewModels.ProfileScreenState> _profileScreenState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.example.shopping.presentation.viewModels.ProfileScreenState> profileScreenState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.shopping.presentation.viewModels.UpDateScreenState> _upDateScreenState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.example.shopping.presentation.viewModels.UpDateScreenState> upDateScreenState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.shopping.presentation.viewModels.uploadUserProfileImageState> _userProfileImageState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.example.shopping.presentation.viewModels.uploadUserProfileImageState> userProfileImageState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.shopping.presentation.viewModels.AddtoCardState> _addToCartState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.example.shopping.presentation.viewModels.AddtoCardState> addToCartState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.shopping.presentation.viewModels.GetProductByIDState> _getProductByIDState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.example.shopping.presentation.viewModels.GetProductByIDState> getProductByIDState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.shopping.presentation.viewModels.AddtoFavState> _addtoFavState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.example.shopping.presentation.viewModels.AddtoFavState> addtoFavState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.shopping.presentation.viewModels.GetAllFavState> _getAllFavState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.example.shopping.presentation.viewModels.GetAllFavState> getAllFavState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.shopping.presentation.viewModels.GetAllProductsState> _getAllProductsState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.example.shopping.presentation.viewModels.GetAllProductsState> getAllProductsState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.shopping.presentation.viewModels.GetCartsState> _getCartState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.example.shopping.presentation.viewModels.GetCartsState> getCartState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.shopping.presentation.viewModels.GetAllCategoriesState> _getAllCategoriesState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.example.shopping.presentation.viewModels.GetAllCategoriesState> getAllCategoriesState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.shopping.presentation.viewModels.GetCheckOutState> _getCheckOutState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.example.shopping.presentation.viewModels.GetCheckOutState> getCheckOutState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.shopping.common.HomeScreenState> _homeScreenState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.example.shopping.common.HomeScreenState> homeScreenState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.shopping.presentation.viewModels.GetSpecifiCategoryItemsState> _getSpecifiCategoryItemsState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.example.shopping.presentation.viewModels.GetSpecifiCategoryItemsState> getSpecifiCategoryItemsState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.shopping.presentation.viewModels.GetAllSuggestedProductsState> _getAllSuggestedProductsState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.example.shopping.presentation.viewModels.GetAllSuggestedProductsState> getAllSuggestedProductsState = null;
    
    @javax.inject.Inject
    public ShoppingAppViewModel(@org.jetbrains.annotations.NotNull
    com.example.shopping.domain.useCase.CreateUserUseCase createUserUseCase, @org.jetbrains.annotations.NotNull
    com.example.shopping.domain.useCase.LoginUserUseCase loginUserUseCase, @org.jetbrains.annotations.NotNull
    com.example.shopping.domain.useCase.GetUserUseCase getUserUseCase, @org.jetbrains.annotations.NotNull
    com.example.shopping.domain.useCase.UpDateUserDataUseCase upDateUserDataUseCase, @org.jetbrains.annotations.NotNull
    com.example.shopping.domain.useCase.userProfileImageUseCase userProfileImageUseCase, @org.jetbrains.annotations.NotNull
    com.example.shopping.domain.useCase.getCategoryInLimit getCategoryInLimit, @org.jetbrains.annotations.NotNull
    com.example.shopping.domain.useCase.getProductsInLimitUseCase getProductsInLimitUseCase, @org.jetbrains.annotations.NotNull
    com.example.shopping.domain.useCase.AddtoCardUseCase addtoCardUseCase, @org.jetbrains.annotations.NotNull
    com.example.shopping.domain.useCase.getProductByID getProductByID, @org.jetbrains.annotations.NotNull
    com.example.shopping.domain.useCase.AddToFavUseCase addtoFavUseCase, @org.jetbrains.annotations.NotNull
    com.example.shopping.domain.useCase.GetAllFavUseCase getAllFavUseCase, @org.jetbrains.annotations.NotNull
    com.example.shopping.domain.useCase.GetAllProductUseCase getAllProductsUseCase, @org.jetbrains.annotations.NotNull
    com.example.shopping.domain.useCase.GetCartUseCase getCartUseCase, @org.jetbrains.annotations.NotNull
    com.example.shopping.domain.useCase.GetAllCategoriesUseCase getAllCategoriesUseCase, @org.jetbrains.annotations.NotNull
    com.example.shopping.domain.useCase.GetCheckOutUseCase getCheckOutUseCase, @org.jetbrains.annotations.NotNull
    com.example.shopping.domain.useCase.GetBannerUseCase getBannerUseCase, @org.jetbrains.annotations.NotNull
    com.example.shopping.domain.useCase.GetSpecifiCategoryItems getSpecifiCategoryItems, @org.jetbrains.annotations.NotNull
    com.example.shopping.domain.useCase.GetAllSuggestedProductsUseCase getAllSuggestedProductsUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.example.shopping.presentation.viewModels.SignUpScreenState> getSingUpScreenState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.example.shopping.presentation.viewModels.LoginScreenState> getLoginScreenState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.example.shopping.presentation.viewModels.ProfileScreenState> getProfileScreenState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.example.shopping.presentation.viewModels.UpDateScreenState> getUpDateScreenState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.example.shopping.presentation.viewModels.uploadUserProfileImageState> getUserProfileImageState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.example.shopping.presentation.viewModels.AddtoCardState> getAddToCartState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.example.shopping.presentation.viewModels.GetProductByIDState> getGetProductByIDState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.example.shopping.presentation.viewModels.AddtoFavState> getAddtoFavState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.example.shopping.presentation.viewModels.GetAllFavState> getGetAllFavState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.example.shopping.presentation.viewModels.GetAllProductsState> getGetAllProductsState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.example.shopping.presentation.viewModels.GetCartsState> getGetCartState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.example.shopping.presentation.viewModels.GetAllCategoriesState> getGetAllCategoriesState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.example.shopping.presentation.viewModels.GetCheckOutState> getGetCheckOutState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.example.shopping.common.HomeScreenState> getHomeScreenState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.example.shopping.presentation.viewModels.GetSpecifiCategoryItemsState> getGetSpecifiCategoryItemsState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.example.shopping.presentation.viewModels.GetAllSuggestedProductsState> getGetAllSuggestedProductsState() {
        return null;
    }
    
    public final void getSpecifiCategoryItems(@org.jetbrains.annotations.NotNull
    java.lang.String categoryName) {
    }
    
    public final void getCheckOut(@org.jetbrains.annotations.NotNull
    java.lang.String productId) {
    }
    
    public final void getAllCategories() {
    }
    
    public final void getCart() {
    }
    
    public final void getAllProducts() {
    }
    
    public final void getAllFav() {
    }
    
    public final void addToFav(@org.jetbrains.annotations.NotNull
    com.example.shopping.domain.models.ProductDataModels productDataModels) {
    }
    
    public final void getProductByID(@org.jetbrains.annotations.NotNull
    java.lang.String productId) {
    }
    
    public final void addToCart(@org.jetbrains.annotations.NotNull
    com.example.shopping.domain.models.CartDataModels cartDataModels) {
    }
    
    public final void loadHomeScreenData() {
    }
    
    public final void upLoadUserProfileImage(@org.jetbrains.annotations.NotNull
    android.net.Uri uri) {
    }
    
    public final void upDateUserData(@org.jetbrains.annotations.NotNull
    com.example.shopping.domain.models.UserDataParent userDataParent) {
    }
    
    public final void createUser(@org.jetbrains.annotations.NotNull
    com.example.shopping.domain.models.UserData userData) {
    }
    
    public final void loginUser(@org.jetbrains.annotations.NotNull
    com.example.shopping.domain.models.UserData userData) {
    }
    
    public final void getUserById(@org.jetbrains.annotations.NotNull
    java.lang.String uid) {
    }
    
    public final void getAllSuggestedProducts() {
    }
}