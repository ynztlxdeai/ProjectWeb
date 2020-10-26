package com.luoxiang.project.service.impl;

import com.luoxiang.project.mapper.YiBin202002Mapper;
import com.luoxiang.project.service.YiBinService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * projectName: 	    com.luoxiang.parent
 * packageName:	        com.luoxiang.project.service.impl
 * className:	        YiBinServiceImpl
 * author:	            Luoxiang
 * time:	            2020/10/26	12:24
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    Vincent
 * upDate:	            2020/10/26
 * upDateDesc:	        TODO
 */

@Service
public class YiBinServiceImpl implements YiBinService {
    @Resource
    YiBin202002Mapper yiBin202002Mapper;


}
