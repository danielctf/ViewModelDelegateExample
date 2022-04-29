package com.example.viewmodeldelegateexample.viewmodel

import androidx.lifecycle.MutableLiveData
import com.example.viewmodeldelegateexample.usecase.GetTotalVisitsUseCase
import com.example.viewmodeldelegateexample.usecase.GetUserUseCase
import javax.inject.Inject

interface CurrentUserViewModelDelegate {

    val user: MutableLiveData<String>
    val visits: MutableLiveData<String>

    fun onGetVisitsClicked()
}

class CurrentUserViewModelDelegateImpl @Inject constructor(
    getUserUseCase: GetUserUseCase,
    private val getTotalVisitsUseCase: GetTotalVisitsUseCase
) : CurrentUserViewModelDelegate {

    override val user = MutableLiveData(getUserUseCase())
    override val visits = MutableLiveData<String>()

    override fun onGetVisitsClicked() {
        visits.value = getTotalVisitsUseCase()
    }
}
