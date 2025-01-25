package com.example.griotoldlog.request;

import jakarta.validation.constraints.NotBlank;

public record PostCreate(
        @NotBlank
        String title,

        @NotBlank
        String content
) {
}
