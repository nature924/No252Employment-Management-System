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


import com.dao.XingyeleixingDao;
import com.entity.XingyeleixingEntity;
import com.service.XingyeleixingService;
import com.entity.vo.XingyeleixingVO;
import com.entity.view.XingyeleixingView;

@Service("xingyeleixingService")
public class XingyeleixingServiceImpl extends ServiceImpl<XingyeleixingDao, XingyeleixingEntity> implements XingyeleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XingyeleixingEntity> page = this.selectPage(
                new Query<XingyeleixingEntity>(params).getPage(),
                new EntityWrapper<XingyeleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XingyeleixingEntity> wrapper) {
		  Page<XingyeleixingView> page =new Query<XingyeleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XingyeleixingVO> selectListVO(Wrapper<XingyeleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XingyeleixingVO selectVO(Wrapper<XingyeleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XingyeleixingView> selectListView(Wrapper<XingyeleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XingyeleixingView selectView(Wrapper<XingyeleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
