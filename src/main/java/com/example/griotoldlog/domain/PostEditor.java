package com.example.griotoldlog.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PostEditor {
    private final String title;
    private final String content;
}
