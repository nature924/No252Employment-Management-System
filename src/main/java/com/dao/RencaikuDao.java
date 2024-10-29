package com.dao;

import com.entity.RencaikuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RencaikuVO;
import com.entity.view.RencaikuView;


/**
 * 人才库
 * 
 * @author 
 * @email 
 * @date 2023-02-20 12:17:02
 */
public interface RencaikuDao extends BaseMapper<RencaikuEntity> {
	
	List<RencaikuVO> selectListVO(@Param("ew") Wrapper<RencaikuEntity> wrapper);
	
	RencaikuVO selectVO(@Param("ew") Wrapper<RencaikuEntity> wrapper);
	
	List<RencaikuView> selectListView(@Param("ew") Wrapper<RencaikuEntity> wrapper);

	List<RencaikuView> selectListView(Pagination page,@Param("ew") Wrapper<RencaikuEntity> wrapper);
	
	RencaikuView selectView(@Param("ew") Wrapper<RencaikuEntity> wrapper);
	

}
