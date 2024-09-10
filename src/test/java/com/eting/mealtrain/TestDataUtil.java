package com.eting.mealtrain;

import com.eting.mealtrain.entity.AppUser;

public final class TestDataUtil {

    private TestDataUtil(){}

    public static AppUser createTestUser() {
        return AppUser.builder()
                .name("Michael Scott")
                .email("ms@dundermifflin.com")
                .build();
    }

    public static AppUser createTestUserA() {
        return AppUser.builder()
                .name("Dwight Howard")
                .email("dh@dundermifflin.com")
                .build();
    }
}
