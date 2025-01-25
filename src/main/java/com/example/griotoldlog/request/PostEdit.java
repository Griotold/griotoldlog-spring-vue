package com.example.griotoldlog.request;

import jakarta.validation.constraints.NotBlank;

public record PostEdit(

        @NotBlank(message = "타이틀을 입력하세요.")
        String title,

        @NotBlank(message = "콘텐츠를 입력하세요.")
        String content
) {
}
