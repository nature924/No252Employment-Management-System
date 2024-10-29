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


import com.dao.MianshiyaoqingDao;
import com.entity.MianshiyaoqingEntity;
import com.service.MianshiyaoqingService;
import com.entity.vo.MianshiyaoqingVO;
import com.entity.view.MianshiyaoqingView;

@Service("mianshiyaoqingService")
public class MianshiyaoqingServiceImpl extends ServiceImpl<MianshiyaoqingDao, MianshiyaoqingEntity> implements MianshiyaoqingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MianshiyaoqingEntity> page = this.selectPage(
                new Query<MianshiyaoqingEntity>(params).getPage(),
                new EntityWrapper<MianshiyaoqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MianshiyaoqingEntity> wrapper) {
		  Page<MianshiyaoqingView> page =new Query<MianshiyaoqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MianshiyaoqingVO> selectListVO(Wrapper<MianshiyaoqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MianshiyaoqingVO selectVO(Wrapper<MianshiyaoqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MianshiyaoqingView> selectListView(Wrapper<MianshiyaoqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MianshiyaoqingView selectView(Wrapper<MianshiyaoqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
