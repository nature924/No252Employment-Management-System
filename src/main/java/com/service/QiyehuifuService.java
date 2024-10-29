package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiyehuifuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiyehuifuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiyehuifuView;


/**
 * 企业回复
 *
 * @author 
 * @email 
 * @date 2023-02-20 12:17:02
 */
public interface QiyehuifuService extends IService<QiyehuifuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiyehuifuVO> selectListVO(Wrapper<QiyehuifuEntity> wrapper);
   	
   	QiyehuifuVO selectVO(@Param("ew") Wrapper<QiyehuifuEntity> wrapper);
   	
   	List<QiyehuifuView> selectListView(Wrapper<QiyehuifuEntity> wrapper);
   	
   	QiyehuifuView selectView(@Param("ew") Wrapper<QiyehuifuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiyehuifuEntity> wrapper);
   	

}

