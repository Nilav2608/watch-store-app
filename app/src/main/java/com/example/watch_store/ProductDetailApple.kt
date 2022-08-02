package com.example.watch_store

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ProductDetailApple : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail_apple)
        supportActionBar?.hide()
    }
}