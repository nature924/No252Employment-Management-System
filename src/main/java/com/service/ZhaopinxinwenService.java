package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhaopinxinwenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhaopinxinwenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhaopinxinwenView;


/**
 * 招聘新闻
 *
 * @author 
 * @email 
 * @date 2023-02-20 12:17:02
 */
public interface ZhaopinxinwenService extends IService<ZhaopinxinwenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhaopinxinwenVO> selectListVO(Wrapper<ZhaopinxinwenEntity> wrapper);
   	
   	ZhaopinxinwenVO selectVO(@Param("ew") Wrapper<ZhaopinxinwenEntity> wrapper);
   	
   	List<ZhaopinxinwenView> selectListView(Wrapper<ZhaopinxinwenEntity> wrapper);
   	
   	ZhaopinxinwenView selectView(@Param("ew") Wrapper<ZhaopinxinwenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhaopinxinwenEntity> wrapper);
   	

}

