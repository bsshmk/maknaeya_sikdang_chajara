package com.mksoft.maknaeya_sikdang_chajara.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mksoft.maknaeya_sikdang_chajara.viewmodel.FoodMapViewModel
import com.mksoft.maknaeya_sikdang_chajara.viewmodel.OptionViewModel

class ViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(FoodMapViewModel::class.java)) {
            return FoodMapViewModel() as T
        } else if (modelClass.isAssignableFrom(OptionViewModel::class.java)) {
            return OptionViewModel() as T
        }

        throw IllegalAccessException("Unknown ViewModel...") as Throwable
    }

}