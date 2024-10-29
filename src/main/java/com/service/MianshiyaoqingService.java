package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MianshiyaoqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MianshiyaoqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MianshiyaoqingView;


/**
 * 面试邀请
 *
 * @author 
 * @email 
 * @date 2023-02-20 12:17:02
 */
public interface MianshiyaoqingService extends IService<MianshiyaoqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MianshiyaoqingVO> selectListVO(Wrapper<MianshiyaoqingEntity> wrapper);
   	
   	MianshiyaoqingVO selectVO(@Param("ew") Wrapper<MianshiyaoqingEntity> wrapper);
   	
   	List<MianshiyaoqingView> selectListView(Wrapper<MianshiyaoqingEntity> wrapper);
   	
   	MianshiyaoqingView selectView(@Param("ew") Wrapper<MianshiyaoqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MianshiyaoqingEntity> wrapper);
   	

}

