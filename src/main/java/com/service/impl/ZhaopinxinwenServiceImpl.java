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


import com.dao.ZhaopinxinwenDao;
import com.entity.ZhaopinxinwenEntity;
import com.service.ZhaopinxinwenService;
import com.entity.vo.ZhaopinxinwenVO;
import com.entity.view.ZhaopinxinwenView;

@Service("zhaopinxinwenService")
public class ZhaopinxinwenServiceImpl extends ServiceImpl<ZhaopinxinwenDao, ZhaopinxinwenEntity> implements ZhaopinxinwenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhaopinxinwenEntity> page = this.selectPage(
                new Query<ZhaopinxinwenEntity>(params).getPage(),
                new EntityWrapper<ZhaopinxinwenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhaopinxinwenEntity> wrapper) {
		  Page<ZhaopinxinwenView> page =new Query<ZhaopinxinwenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhaopinxinwenVO> selectListVO(Wrapper<ZhaopinxinwenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhaopinxinwenVO selectVO(Wrapper<ZhaopinxinwenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhaopinxinwenView> selectListView(Wrapper<ZhaopinxinwenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhaopinxinwenView selectView(Wrapper<ZhaopinxinwenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
