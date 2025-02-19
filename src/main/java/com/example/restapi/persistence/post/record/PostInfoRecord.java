package com.example.restapi.persistence.post.record;

import com.querydsl.core.annotations.QueryProjection;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostInfoRecord {

    private final Long id;
    private final String title;
    private final String content;
    private final LocalDateTime createdAt;
    private final UserData user;

    @QueryProjection
    public PostInfoRecord(Long id,
                          String title,
                          String content,
                          LocalDateTime createdAt,
                          Long userId,
                          String userNickName) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.createdAt = createdAt;
        this.user = new UserData(userId, userNickName);
    }

    @Getter
    @AllArgsConstructor
    public static class UserData {
        private Long id;
        private String nickName;
    }

}
