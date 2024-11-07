package config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    // Hoca API'leri için Swagger konfigürasyonu
    @Bean
    public GroupedOpenApi hocaApi() {
        return GroupedOpenApi.builder()
                .group("Hoca API")
                .pathsToMatch("/api/hoca/**") // Hoca ile ilgili tüm yollar
                .build();
    }

    // Yorum API'leri için Swagger konfigürasyonu
    @Bean
    public GroupedOpenApi yorumApi() {
        return GroupedOpenApi.builder()
                .group("Yorum API")
                .pathsToMatch("/api/hoca/{hoca_id}/yorumlar/**") // Yorum ile ilgili tüm yollar
                .build();
    }

    // Tüm API'leri kapsayan genel Swagger konfigürasyonu (isteğe bağlı)
    @Bean
    public GroupedOpenApi allApi() {
        return GroupedOpenApi.builder()
                .group("All APIs")
                .pathsToMatch("/api/**") // Tüm API yollarını dahil et
                .build();
    }
}