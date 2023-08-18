package com.mzcms.utils;

import org.springframework.util.DigestUtils;

public class MD5Utils {
    /**
     * 将字符串进行MD5加密
     */
    public static String getMd5Simple(String str){
        return DigestUtils.md5DigestAsHex(str.getBytes());
    }
}
