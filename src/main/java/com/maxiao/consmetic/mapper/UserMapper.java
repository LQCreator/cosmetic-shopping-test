package com.maxiao.consmetic.mapper;

import com.maxiao.consmetic.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User queryUser(String userId);
}
