package com.example.shopping.domain.useCase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/example/shopping/domain/useCase/GetUserUseCase;", "", "repo", "Lcom/example/shopping/domain/repo/Repo;", "(Lcom/example/shopping/domain/repo/Repo;)V", "getRepo", "()Lcom/example/shopping/domain/repo/Repo;", "getuserById", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/shopping/common/ResultState;", "Lcom/example/shopping/domain/models/UserDataParent;", "uid", "", "app_debug"})
public final class GetUserUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.example.shopping.domain.repo.Repo repo = null;
    
    @javax.inject.Inject
    public GetUserUseCase(@org.jetbrains.annotations.NotNull
    com.example.shopping.domain.repo.Repo repo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.shopping.domain.repo.Repo getRepo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.example.shopping.common.ResultState<com.example.shopping.domain.models.UserDataParent>> getuserById(@org.jetbrains.annotations.NotNull
    java.lang.String uid) {
        return null;
    }
}