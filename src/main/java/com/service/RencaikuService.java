package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RencaikuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RencaikuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RencaikuView;


/**
 * 人才库
 *
 * @author 
 * @email 
 * @date 2023-02-20 12:17:02
 */
public interface RencaikuService extends IService<RencaikuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RencaikuVO> selectListVO(Wrapper<RencaikuEntity> wrapper);
   	
   	RencaikuVO selectVO(@Param("ew") Wrapper<RencaikuEntity> wrapper);
   	
   	List<RencaikuView> selectListView(Wrapper<RencaikuEntity> wrapper);
   	
   	RencaikuView selectView(@Param("ew") Wrapper<RencaikuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RencaikuEntity> wrapper);
   	

}

