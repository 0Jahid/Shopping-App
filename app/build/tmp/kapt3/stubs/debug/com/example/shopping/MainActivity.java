package com.example.shopping;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\f\u001a\u00020\u000bH\u0007J\u0012\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u001a\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0014H\u0016J\u0006\u0010\u0016\u001a\u00020\u000bR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0017"}, d2 = {"Lcom/example/shopping/MainActivity;", "Landroidx/activity/ComponentActivity;", "Lcom/razorpay/PaymentResultListener;", "()V", "firebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "getFirebaseAuth", "()Lcom/google/firebase/auth/FirebaseAuth;", "setFirebaseAuth", "(Lcom/google/firebase/auth/FirebaseAuth;)V", "MainScreen", "", "SplashScreen", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPaymentError", "p0", "", "p1", "", "onPaymentSuccess", "payTest", "app_debug"})
public final class MainActivity extends androidx.activity.ComponentActivity implements com.razorpay.PaymentResultListener {
    @javax.inject.Inject
    public com.google.firebase.auth.FirebaseAuth firebaseAuth;
    
    public MainActivity() {
        super(0);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.firebase.auth.FirebaseAuth getFirebaseAuth() {
        return null;
    }
    
    public final void setFirebaseAuth(@org.jetbrains.annotations.NotNull
    com.google.firebase.auth.FirebaseAuth p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @androidx.compose.runtime.Composable
    public final void MainScreen(@org.jetbrains.annotations.NotNull
    com.google.firebase.auth.FirebaseAuth firebaseAuth) {
    }
    
    @androidx.compose.runtime.Composable
    public final void SplashScreen() {
    }
    
    public final void payTest() {
    }
    
    @java.lang.Override
    public void onPaymentSuccess(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @java.lang.Override
    public void onPaymentError(int p0, @org.jetbrains.annotations.Nullable
    java.lang.String p1) {
    }
}