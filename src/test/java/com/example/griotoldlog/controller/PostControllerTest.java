package com.example.griotoldlog.controller;

import com.example.griotoldlog.request.PostCreate;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class PostControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @DisplayName("post 요청")
    @Test
    void post_test() throws Exception {
        // given
        PostCreate postCreate = new PostCreate("글 제목", "글 컨텐츠");

        // when
        String requestToJson = objectMapper.writeValueAsString(postCreate);
        mockMvc.perform(post("/posts")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(requestToJson)
                ).andExpect(status().isOk())
                .andDo(print());
        // then
    }

    @DisplayName("/posts 요청시 Hello World를 출력한다.")
    @Test
    void test() throws Exception {
        mockMvc.perform(get("/posts"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("hello world"))
                .andDo(print());

    }

}