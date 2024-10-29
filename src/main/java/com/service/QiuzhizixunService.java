package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiuzhizixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiuzhizixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiuzhizixunView;


/**
 * 求职咨询
 *
 * @author 
 * @email 
 * @date 2023-02-20 12:17:02
 */
public interface QiuzhizixunService extends IService<QiuzhizixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiuzhizixunVO> selectListVO(Wrapper<QiuzhizixunEntity> wrapper);
   	
   	QiuzhizixunVO selectVO(@Param("ew") Wrapper<QiuzhizixunEntity> wrapper);
   	
   	List<QiuzhizixunView> selectListView(Wrapper<QiuzhizixunEntity> wrapper);
   	
   	QiuzhizixunView selectView(@Param("ew") Wrapper<QiuzhizixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiuzhizixunEntity> wrapper);
   	

}

