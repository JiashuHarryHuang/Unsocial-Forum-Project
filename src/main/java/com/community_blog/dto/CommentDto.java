package com.community_blog.dto;

import com.community_blog.domain.Comment;
import com.community_blog.domain.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 评论数据传输对象，包含帖子评论以及回复
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CommentDto extends Comment {
    /**
     * 发评论的用户
     */
    private User commenter;

    /**
     * 评论的对象，如果没有针对的用户则为null
     */
    private User target;

    /**
     * 当前评论下的所有回复
     */
    private List<CommentDto> replies;

    /**
     * 点赞数量
     */
    private long likeCount;

    /**
     * 点赞状态
     */
    private int likeStatus;

    /**
     * 获取回复数量
     * @return 回复数量
     */
    public int getReplyCount() {
        return replies.size();
    }
}