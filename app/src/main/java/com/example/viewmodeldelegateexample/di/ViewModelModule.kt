package com.example.viewmodeldelegateexample.di

import com.example.viewmodeldelegateexample.viewmodel.CurrentUserViewModelDelegate
import com.example.viewmodeldelegateexample.viewmodel.CurrentUserViewModelDelegateImpl
import com.example.viewmodeldelegateexample.viewmodel.OnlineUsersViewModelDelegate
import com.example.viewmodeldelegateexample.viewmodel.OnlineUsersViewModelDelegateImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class ViewModelModule {

    @Binds
    abstract fun bindsCurrentUserViewModelDelegate(
        delegate: CurrentUserViewModelDelegateImpl
    ): CurrentUserViewModelDelegate

    @Binds
    abstract fun bindsOnlineUsersViewModelDelegate(
        delegate: OnlineUsersViewModelDelegateImpl
    ): OnlineUsersViewModelDelegate
}
