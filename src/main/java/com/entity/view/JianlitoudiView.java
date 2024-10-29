package com.entity.view;

import com.entity.JianlitoudiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 简历投递
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-20 12:17:02
 */
@TableName("jianlitoudi")
public class JianlitoudiView  extends JianlitoudiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JianlitoudiView(){
	}
 
 	public JianlitoudiView(JianlitoudiEntity jianlitoudiEntity){
 	try {
			BeanUtils.copyProperties(this, jianlitoudiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
