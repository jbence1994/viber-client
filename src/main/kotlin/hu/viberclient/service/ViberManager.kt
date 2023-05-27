package hu.viberclient.service

import okhttp3.OkHttpClient
import org.springframework.stereotype.Component

@Component
class ViberManager(
    private val okHttpClient: OkHttpClient
)
