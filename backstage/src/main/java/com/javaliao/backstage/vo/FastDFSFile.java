package com.javaliao.backstage.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 文件上传信息
 *      时间
 *      author 作者
 *      类型
 *      size 大小
 *      附加信息
 *      后缀
 *      文件内容 -> 文件的字节数组
 */
@Data
public class FastDFSFile implements Serializable {
    private static final long serialVersionUID = 1184827750118430918L;
    /** 文件名称 */
    private String name;
    /** 文件内容 */
    private byte[] content;
    /** 文件扩展名 */
    private String ext;
    /** 文件 MD5 摘要值 */
    private String md5;
    /** 文件创建作者 */
    private String author;

    public FastDFSFile(String name, byte[] content, String ext, String md5, String author) {
        this.name = name;
        this.content = content;
        this.ext = ext;
        this.md5 = md5;
        this.author = author;
    }

    public FastDFSFile(String name, byte[] content, String ext) {
        this.name = name;
        this.content = content;
        this.ext = ext;
    }

    public FastDFSFile() {
    }

}

