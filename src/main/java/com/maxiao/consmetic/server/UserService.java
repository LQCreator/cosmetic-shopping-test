package com.maxiao.consmetic.server;

import com.maxiao.consmetic.domain.User;
import org.springframework.stereotype.Service;

public interface UserService {
    User queryUser(String userId);
}
