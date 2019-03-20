package com.byyuengc.api.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="PARTNER_KDvRV286Us")
public class MongoUser {
    private int uid;
    private String wx_openid;
    private String mobile;
    private String avatar;
    private String nickname;
    private String role;
    private String status;
    @Override
    public String toString() {
        return "MongoUser [uid=" + uid + ", wx_openid=" + wx_openid + ", mobile=" + mobile + ", avatar=" + avatar
                + ", nickname=" + nickname + ", role=" + role + ", status=" + status + "]";
    }
    
}
