package com.example.shopping.domain.useCase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/shopping/domain/useCase/LoginUserUseCase;", "", "repo", "Lcom/example/shopping/domain/repo/Repo;", "(Lcom/example/shopping/domain/repo/Repo;)V", "loginUser", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/shopping/common/ResultState;", "", "userData", "Lcom/example/shopping/domain/models/UserData;", "app_debug"})
public final class LoginUserUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.example.shopping.domain.repo.Repo repo = null;
    
    @javax.inject.Inject
    public LoginUserUseCase(@org.jetbrains.annotations.NotNull
    com.example.shopping.domain.repo.Repo repo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.example.shopping.common.ResultState<java.lang.String>> loginUser(@org.jetbrains.annotations.NotNull
    com.example.shopping.domain.models.UserData userData) {
        return null;
    }
}