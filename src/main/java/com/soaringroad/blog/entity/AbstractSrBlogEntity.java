package com.soaringroad.blog.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.soaringroad.blog.core.SrBlogContextContainer;
import com.soaringroad.blog.dao.AbstractSrBlogDao;

/**
 * Entity接口
 * 
 * @author wangzhenhui1992
 */
public abstract class AbstractSrBlogEntity implements SrBlogEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
