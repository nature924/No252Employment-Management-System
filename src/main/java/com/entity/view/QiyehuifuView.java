package com.entity.view;

import com.entity.QiyehuifuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 企业回复
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-20 12:17:02
 */
@TableName("qiyehuifu")
public class QiyehuifuView  extends QiyehuifuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QiyehuifuView(){
	}
 
 	public QiyehuifuView(QiyehuifuEntity qiyehuifuEntity){
 	try {
			BeanUtils.copyProperties(this, qiyehuifuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
