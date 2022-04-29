package com.example.viewmodeldelegateexample.viewmodel

import androidx.lifecycle.MutableLiveData
import com.example.viewmodeldelegateexample.usecase.GetOnlineUsersUseCase
import com.example.viewmodeldelegateexample.usecase.KickRandomUserUseCase
import javax.inject.Inject

interface OnlineUsersViewModelDelegate {
    val onlineUsers: MutableLiveData<String>

    fun onGetOnlineUsersClicked()
    fun onKickUserClicked()
}

class OnlineUsersViewModelDelegateImpl @Inject constructor(
    private val getOnlineUsersUseCase: GetOnlineUsersUseCase,
    private val kickRandomUserUseCase: KickRandomUserUseCase
) : OnlineUsersViewModelDelegate {

    override val onlineUsers = MutableLiveData<String>()

    override fun onGetOnlineUsersClicked() {
        onlineUsers.value = getOnlineUsersUseCase()
    }

    override fun onKickUserClicked() {
        onlineUsers.value = kickRandomUserUseCase()
    }
}
