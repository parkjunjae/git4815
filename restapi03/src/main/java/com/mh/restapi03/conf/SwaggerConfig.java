package com.mh.restapi03.conf;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 제목이랑 소제목을 정할 수 있다.
@OpenAPIDefinition(
        info = @Info(title = "MH 가 만든 USER,MAIN",

                    description = "유저 등록 수정 삭제 조회 등이 가능합니다.",
                version = "v1.0.0"
        )
)
@Configuration
public class SwaggerConfig {


        // 지정된것만 swagger에 보여줘라
        @Bean
        public GroupedOpenApi groupedOpenApi(){
                String paths[] = {"/users/**"};
                // user/** user만 보여줘라
                return GroupedOpenApi.builder()
                        .group("userController 만 보여지게 된다.")
                        .pathsToMatch(paths)
                        .build();
        }

}
