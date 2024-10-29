package com.dao;

import com.entity.QiyehuifuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiyehuifuVO;
import com.entity.view.QiyehuifuView;


/**
 * 企业回复
 * 
 * @author 
 * @email 
 * @date 2023-02-20 12:17:02
 */
public interface QiyehuifuDao extends BaseMapper<QiyehuifuEntity> {
	
	List<QiyehuifuVO> selectListVO(@Param("ew") Wrapper<QiyehuifuEntity> wrapper);
	
	QiyehuifuVO selectVO(@Param("ew") Wrapper<QiyehuifuEntity> wrapper);
	
	List<QiyehuifuView> selectListView(@Param("ew") Wrapper<QiyehuifuEntity> wrapper);

	List<QiyehuifuView> selectListView(Pagination page,@Param("ew") Wrapper<QiyehuifuEntity> wrapper);
	
	QiyehuifuView selectView(@Param("ew") Wrapper<QiyehuifuEntity> wrapper);
	

}
