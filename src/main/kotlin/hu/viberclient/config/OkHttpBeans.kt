package hu.viberclient.config

import okhttp3.OkHttpClient
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class OkHttpBeans {
    @Bean
    fun okHttpClient(): OkHttpClient = OkHttpClient()
}
