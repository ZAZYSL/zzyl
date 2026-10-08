package com.zzyl.framework.interceptor;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.zzyl.common.core.domain.model.LoginUser;
import com.zzyl.common.utils.SecurityUtils;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

import static com.zzyl.common.utils.SecurityUtils.getLoginUser;

@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        // log.info("开始插入填充...");
        this.strictInsertFill(metaObject, "createBy", String.class, String.valueOf(getLoginUser()));
        this.strictInsertFill(metaObject, "createTime", Date.class, new Date());
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        /* log.info("开始更新填充...");
        this.strictInsertFill(metaObject, "updateUserId", Long.class, 123456L)
        this.strictUpdateFill(metaObject, "updateTime", LocalDateTime.class, LocalDateTime.now()); */
        this.setFieldValByName("updateBy", String.valueOf(getLoginUser()), metaObject);
        this.setFieldValByName("updateTime", new Date(), metaObject);


    }

    public Long getLoginUser(){
        LoginUser loginUser = SecurityUtils.getLoginUser();

        if (loginUser != null) {
            return loginUser.getUserId();
        }
        return 1L;
    }
}
