package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XingyeleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XingyeleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XingyeleixingView;


/**
 * 行业类型
 *
 * @author 
 * @email 
 * @date 2023-02-20 12:17:02
 */
public interface XingyeleixingService extends IService<XingyeleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XingyeleixingVO> selectListVO(Wrapper<XingyeleixingEntity> wrapper);
   	
   	XingyeleixingVO selectVO(@Param("ew") Wrapper<XingyeleixingEntity> wrapper);
   	
   	List<XingyeleixingView> selectListView(Wrapper<XingyeleixingEntity> wrapper);
   	
   	XingyeleixingView selectView(@Param("ew") Wrapper<XingyeleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XingyeleixingEntity> wrapper);
   	

}

