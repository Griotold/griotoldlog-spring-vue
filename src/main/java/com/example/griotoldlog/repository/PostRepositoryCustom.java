package com.example.griotoldlog.repository;

import com.example.griotoldlog.domain.Post;
import com.example.griotoldlog.request.PostSearch;

import java.util.List;

public interface PostRepositoryCustom {

    List<Post> getList(PostSearch postSearch);
}
