package com.example.shopping.domain.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/example/shopping/domain/di/DomainModule;", "", "()V", "provideRepo", "Lcom/example/shopping/domain/repo/Repo;", "firebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "firebaseFirestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class DomainModule {
    
    public DomainModule() {
        super();
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.example.shopping.domain.repo.Repo provideRepo(@org.jetbrains.annotations.NotNull
    com.google.firebase.auth.FirebaseAuth firebaseAuth, @org.jetbrains.annotations.NotNull
    com.google.firebase.firestore.FirebaseFirestore firebaseFirestore) {
        return null;
    }
}