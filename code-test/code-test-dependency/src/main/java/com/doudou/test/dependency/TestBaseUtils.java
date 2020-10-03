package com.doudou.test.dependency;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;

/**
 * @author DouDou
 * @date 2020/10/3
 * @Description
 */
public class TestBaseUtils {

    public static void main(String[] args) {
        String now = DateUtil.now();
        System.out.println(now);

        DateTime dateStr = DateUtil.parse("2020年10月1日 12点23分34秒", "yyyy年MM月dd日 HH点mm分ss秒");
        System.out.println(dateStr);
    }

}
