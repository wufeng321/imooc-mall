package com.imooc.mall.common;

import com.google.common.collect.Sets;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class Constant {
    public static final String IMOOC_MALL_USER = "imooc_mall_user";
    public static final String SALT = "8svbsvjkweDF,.03[";
    public static String FILE_UPLOAD_DIR;

    @Value("${file.upload.dir}")
    public void setFileUploadDir(String fileUploadDir) {
        FILE_UPLOAD_DIR = fileUploadDir;
    }

    public interface ProductListOrderBy {

        Set<String> PRICE_ASC_DESC = Sets.newHashSet("price desc", "price asc");
    }
}
