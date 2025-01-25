package com.example.griotoldlog.request;
import static java.lang.Math.max;
import static java.lang.Math.min;

public record PostSearch(Integer page, Integer size) {

    private static final int MAX_SIZE = 2000;

    // 기본값을 설정하는 정적 팩토리 메서드
    public static PostSearch of(Integer page, Integer size) {
        return new PostSearch(
                page == null ? 1 : page,
                size == null ? 10 : size
        );
    }

    // 기본 생성자에서 유효성 검사 및 기본값 설정
    public PostSearch {
        page = (page == null || page < 1) ? 1 : page;
        size = (size == null || size > MAX_SIZE) ? 10 : size;
    }

    public long getOffset() {
        return (long) (max(1, page) - 1) * min(size, MAX_SIZE);
    }
}
