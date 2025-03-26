package com.jahid.shoppingapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.jahid.shoppingapp.presentation.LogInScreen
import com.jahid.shoppingapp.ui.theme.ShoppingAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        // Set the content view
        setContent {
            ShoppingAppTheme {
                LogInScreen()
            }
        }
    }


}
