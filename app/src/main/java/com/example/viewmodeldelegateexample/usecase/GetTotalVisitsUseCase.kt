package com.example.viewmodeldelegateexample.usecase

import javax.inject.Inject

class GetTotalVisitsUseCase @Inject constructor() {

    operator fun invoke() = (15..30).random().toString()
}
