package com.yu.service;

import com.yu.utils.MD5Util;

/**
 * @author zYu
 * @version 1.0
 * @create 2024-04-03 19:54
 */
public class MD5Service {
    public String getMD5(String input) {
        return MD5Util.getMD5(input.getBytes());
    }
}
