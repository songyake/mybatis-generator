package com.gm;

import com.gm.GmWechatUser;

public interface GmWechatUserMapper {
    int insert(GmWechatUser record);

    int insertSelective(GmWechatUser record);

    GmWechatUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GmWechatUser record);

    int updateByPrimaryKey(GmWechatUser record);
}