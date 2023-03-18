package com.itche.chapter11;

import java.io.File;
import java.io.FileNotFoundException;

public interface IFileService {
    public static final String SAVR_DIR="d:"+ File.separator+"mldndata"+File.separator;
    /**
     * 定义文件的保存处理方法
     * @return 保存成功保存true,否则返回false
     */
    public boolean save() throws FileNotFoundException, Exception;
}
