package com.chester.community.dao;

import com.chester.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {
    /**
     * 因为返回的是帖子列表，所以用List
     */
    List<DiscussPost> selectDiscussPosts(@Param("userId") int userId, @Param("offset")int offset, @Param("limit")int limit); // offset表示起始行的行号，limit表示每页最多显示多少条数据

    // 帖子的条数
    int selectDiscussPostRows(@Param("userId") int userId); // 加@Param注解的原因，因为要拼动态 SQL ,但是只有一个参数，不加注解会报错
}
