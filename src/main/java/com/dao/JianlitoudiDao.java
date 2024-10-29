package com.dao;

import com.entity.JianlitoudiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianlitoudiVO;
import com.entity.view.JianlitoudiView;


/**
 * 简历投递
 * 
 * @author 
 * @email 
 * @date 2023-02-20 12:17:02
 */
public interface JianlitoudiDao extends BaseMapper<JianlitoudiEntity> {
	
	List<JianlitoudiVO> selectListVO(@Param("ew") Wrapper<JianlitoudiEntity> wrapper);
	
	JianlitoudiVO selectVO(@Param("ew") Wrapper<JianlitoudiEntity> wrapper);
	
	List<JianlitoudiView> selectListView(@Param("ew") Wrapper<JianlitoudiEntity> wrapper);

	List<JianlitoudiView> selectListView(Pagination page,@Param("ew") Wrapper<JianlitoudiEntity> wrapper);
	
	JianlitoudiView selectView(@Param("ew") Wrapper<JianlitoudiEntity> wrapper);
	

}
