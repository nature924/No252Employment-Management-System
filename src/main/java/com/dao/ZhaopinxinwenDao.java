package com.dao;

import com.entity.ZhaopinxinwenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhaopinxinwenVO;
import com.entity.view.ZhaopinxinwenView;


/**
 * 招聘新闻
 * 
 * @author 
 * @email 
 * @date 2023-02-20 12:17:02
 */
public interface ZhaopinxinwenDao extends BaseMapper<ZhaopinxinwenEntity> {
	
	List<ZhaopinxinwenVO> selectListVO(@Param("ew") Wrapper<ZhaopinxinwenEntity> wrapper);
	
	ZhaopinxinwenVO selectVO(@Param("ew") Wrapper<ZhaopinxinwenEntity> wrapper);
	
	List<ZhaopinxinwenView> selectListView(@Param("ew") Wrapper<ZhaopinxinwenEntity> wrapper);

	List<ZhaopinxinwenView> selectListView(Pagination page,@Param("ew") Wrapper<ZhaopinxinwenEntity> wrapper);
	
	ZhaopinxinwenView selectView(@Param("ew") Wrapper<ZhaopinxinwenEntity> wrapper);
	

}
