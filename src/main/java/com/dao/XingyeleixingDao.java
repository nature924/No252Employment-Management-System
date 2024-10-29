package com.dao;

import com.entity.XingyeleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XingyeleixingVO;
import com.entity.view.XingyeleixingView;


/**
 * 行业类型
 * 
 * @author 
 * @email 
 * @date 2023-02-20 12:17:02
 */
public interface XingyeleixingDao extends BaseMapper<XingyeleixingEntity> {
	
	List<XingyeleixingVO> selectListVO(@Param("ew") Wrapper<XingyeleixingEntity> wrapper);
	
	XingyeleixingVO selectVO(@Param("ew") Wrapper<XingyeleixingEntity> wrapper);
	
	List<XingyeleixingView> selectListView(@Param("ew") Wrapper<XingyeleixingEntity> wrapper);

	List<XingyeleixingView> selectListView(Pagination page,@Param("ew") Wrapper<XingyeleixingEntity> wrapper);
	
	XingyeleixingView selectView(@Param("ew") Wrapper<XingyeleixingEntity> wrapper);
	

}
