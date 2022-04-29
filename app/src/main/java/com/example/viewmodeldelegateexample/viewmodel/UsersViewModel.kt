package com.example.viewmodeldelegateexample.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.viewmodeldelegateexample.usecase.GetOnlineUsersUseCase
import com.example.viewmodeldelegateexample.usecase.GetTotalVisitsUseCase
import com.example.viewmodeldelegateexample.usecase.GetUserUseCase
import com.example.viewmodeldelegateexample.usecase.KickRandomUserUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/*
@HiltViewModel
class UsersViewModel @Inject constructor(
    getUserUseCase: GetUserUseCase,
    private val getTotalVisitsUseCase: GetTotalVisitsUseCase,
    private val getOnlineUsersUseCase: GetOnlineUsersUseCase,
    private val kickRandomUserUseCase: KickRandomUserUseCase
) : ViewModel() {

    val user = MutableLiveData(getUserUseCase())
    val visits = MutableLiveData<String>()
    val onlineUsers = MutableLiveData<String>()

    fun onGetVisitsClicked() {
        visits.value = getTotalVisitsUseCase()
    }

    fun onGetOnlineUsersClicked() {
        onlineUsers.value = getOnlineUsersUseCase()
    }

    fun onKickUserClicked() {
        onlineUsers.value = kickRandomUserUseCase()
    }
}
*/

@HiltViewModel
class UsersViewModel @Inject constructor(
    currentUserViewModelDelegate: CurrentUserViewModelDelegate,
    onlineUsersViewModelDelegate: OnlineUsersViewModelDelegate
) : ViewModel(),
    CurrentUserViewModelDelegate by currentUserViewModelDelegate,
    OnlineUsersViewModelDelegate by onlineUsersViewModelDelegate
