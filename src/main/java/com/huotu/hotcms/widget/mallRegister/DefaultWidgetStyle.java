/*
 * 版权所有:杭州火图科技有限公司
 * 地址:浙江省杭州市滨江区西兴街道阡陌路智慧E谷B幢4楼
 *
 * (c) Copyright Hangzhou Hot Technology Co., Ltd.
 * Floor 4,Block B,Wisdom E Valley,Qianmo Road,Binjiang District
 * 2013-2016. All rights reserved.
 */

package com.huotu.hotcms.widget.mallRegister;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import java.util.Locale;
import com.huotu.hotcms.widget.Widget;
import com.huotu.hotcms.widget.WidgetStyle;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import java.util.Locale;

/**
 * @author CJ
 */
public class DefaultWidgetStyle implements WidgetStyle{

    @Override
    public String id() {
        return "mallRegisterDefaultStyle";
    }

    @Override
    public String name(Locale locale) {
        if (locale.equals(Locale.CHINA)) {
            return "默认样式";
        }
        return "default style";
    }

    @Override
    public String description(Locale locale) {
        if (locale.equals(Locale.CHINA)) {
            return "简单的注册控件，仅需要输入用户名和密码";
        }
        return "Simple registration control, only need to enter the user name and password";
    }

    @Override
    public Resource thumbnail() {
        return new ClassPathResource("/thumbnail/defaultStyleThumbnail.png", getClass().getClassLoader());
    }

    @Override
    public Resource previewTemplate() {
        return null;
    }

    @Override
    public Resource browseTemplate() {
        return new ClassPathResource("/template/defaultStyleBrowseTemplate.html", getClass().getClassLoader());
    }

}
