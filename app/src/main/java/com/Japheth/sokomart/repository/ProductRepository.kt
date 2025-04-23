package com.Japheth.sokomart.repository

import  android.content.Context
import com.Japheth.sokomart.data.ProductDatabase
import com.Japheth.sokomart.model.Product

class ProductRepository(context: Context) {
    private val productDao = ProductDatabase.getDatabase(context).productDao()

    suspend fun insertProduct(product: Product) {
        productDao.insertProduct(product)
    }

    fun getAllProducts() = productDao.getAllProducts()

    suspend fun deleteProduct(product: Product) = productDao.deleteProduct(product)
}