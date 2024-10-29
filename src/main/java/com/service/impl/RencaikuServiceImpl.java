package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.RencaikuDao;
import com.entity.RencaikuEntity;
import com.service.RencaikuService;
import com.entity.vo.RencaikuVO;
import com.entity.view.RencaikuView;

@Service("rencaikuService")
public class RencaikuServiceImpl extends ServiceImpl<RencaikuDao, RencaikuEntity> implements RencaikuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RencaikuEntity> page = this.selectPage(
                new Query<RencaikuEntity>(params).getPage(),
                new EntityWrapper<RencaikuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RencaikuEntity> wrapper) {
		  Page<RencaikuView> page =new Query<RencaikuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RencaikuVO> selectListVO(Wrapper<RencaikuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RencaikuVO selectVO(Wrapper<RencaikuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RencaikuView> selectListView(Wrapper<RencaikuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RencaikuView selectView(Wrapper<RencaikuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
