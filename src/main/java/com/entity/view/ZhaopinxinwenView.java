package com.entity.view;

import com.entity.ZhaopinxinwenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 招聘新闻
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-20 12:17:02
 */
@TableName("zhaopinxinwen")
public class ZhaopinxinwenView  extends ZhaopinxinwenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhaopinxinwenView(){
	}
 
 	public ZhaopinxinwenView(ZhaopinxinwenEntity zhaopinxinwenEntity){
 	try {
			BeanUtils.copyProperties(this, zhaopinxinwenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
