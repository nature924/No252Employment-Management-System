package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JianlitoudiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JianlitoudiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JianlitoudiView;


/**
 * 简历投递
 *
 * @author 
 * @email 
 * @date 2023-02-20 12:17:02
 */
public interface JianlitoudiService extends IService<JianlitoudiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianlitoudiVO> selectListVO(Wrapper<JianlitoudiEntity> wrapper);
   	
   	JianlitoudiVO selectVO(@Param("ew") Wrapper<JianlitoudiEntity> wrapper);
   	
   	List<JianlitoudiView> selectListView(Wrapper<JianlitoudiEntity> wrapper);
   	
   	JianlitoudiView selectView(@Param("ew") Wrapper<JianlitoudiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianlitoudiEntity> wrapper);
   	

}

