package com.neepan.shoppinglist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Scaffold
import com.neepan.shoppinglist.ShoppingListApp
import com.neepan.shoppinglist.ui.theme.ShoppingListTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Enable edge-to-edge
        enableEdgeToEdge()
        // Set the content
        setContent {
            ShoppingListTheme {
                Scaffold { padding ->
                    ShoppingListApp(padding)
                }
            }
        }
    }


}




