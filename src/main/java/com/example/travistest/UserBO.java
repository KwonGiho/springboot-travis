package com.example.travistest;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class UserBO {

    public boolean isExistUser(String userId) {
        if (StringUtils.isEmpty(userId)) {
            return false;
        }
        return true;
    }
}
