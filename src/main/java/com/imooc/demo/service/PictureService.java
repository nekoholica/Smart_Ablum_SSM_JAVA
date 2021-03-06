package com.imooc.demo.service;


import com.imooc.demo.bo.Picture;
import com.imooc.demo.bo.RecycleSite;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PictureService {
//    Picture getPicture(int pictureId) throws Exception;
//    List<Picture> listPicture(int userId) throws Exception;
    void insertPicture(Picture picture) throws Throwable;
    public List<String> selectUrlByTagName(String tagName,Integer id);
    public List<Picture> listPicture(Integer id) throws Exception;
    public void deletePicture(Integer id, RecycleSite recycleSite) throws Exception;
    public Integer selectPictureId(String name) throws Exception;
    //分页显示图片
    public List<Picture> listPictureByPage(int currentPage,int pageSize,int id)throws Exception;

    public Long selectPicSize(Integer id);

    public List<String> selectAllByUserId(int currentPage, int pageSize,int id);
}
