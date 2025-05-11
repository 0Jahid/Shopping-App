package com.example.shopping.presentation.navigation;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/shopping/presentation/navigation/SubNavigation;", "", "()V", "LoginSingUpScreen", "MainHomeScreen", "Lcom/example/shopping/presentation/navigation/SubNavigation$LoginSingUpScreen;", "Lcom/example/shopping/presentation/navigation/SubNavigation$MainHomeScreen;", "app_debug"})
public abstract class SubNavigation {
    
    private SubNavigation() {
        super();
    }
    
    @kotlinx.serialization.Serializable
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004H\u00c6\u0001\u00a8\u0006\u0005"}, d2 = {"Lcom/example/shopping/presentation/navigation/SubNavigation$LoginSingUpScreen;", "Lcom/example/shopping/presentation/navigation/SubNavigation;", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "app_debug"})
    public static final class LoginSingUpScreen extends com.example.shopping.presentation.navigation.SubNavigation {
        @org.jetbrains.annotations.NotNull
        public static final com.example.shopping.presentation.navigation.SubNavigation.LoginSingUpScreen INSTANCE = null;
        
        private LoginSingUpScreen() {
        }
        
        @org.jetbrains.annotations.NotNull
        public final kotlinx.serialization.KSerializer<com.example.shopping.presentation.navigation.SubNavigation.LoginSingUpScreen> serializer() {
            return null;
        }
    }
    
    @kotlinx.serialization.Serializable
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004H\u00c6\u0001\u00a8\u0006\u0005"}, d2 = {"Lcom/example/shopping/presentation/navigation/SubNavigation$MainHomeScreen;", "Lcom/example/shopping/presentation/navigation/SubNavigation;", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "app_debug"})
    public static final class MainHomeScreen extends com.example.shopping.presentation.navigation.SubNavigation {
        @org.jetbrains.annotations.NotNull
        public static final com.example.shopping.presentation.navigation.SubNavigation.MainHomeScreen INSTANCE = null;
        
        private MainHomeScreen() {
        }
        
        @org.jetbrains.annotations.NotNull
        public final kotlinx.serialization.KSerializer<com.example.shopping.presentation.navigation.SubNavigation.MainHomeScreen> serializer() {
            return null;
        }
    }
}