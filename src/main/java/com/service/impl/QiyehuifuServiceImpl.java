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


import com.dao.QiyehuifuDao;
import com.entity.QiyehuifuEntity;
import com.service.QiyehuifuService;
import com.entity.vo.QiyehuifuVO;
import com.entity.view.QiyehuifuView;

@Service("qiyehuifuService")
public class QiyehuifuServiceImpl extends ServiceImpl<QiyehuifuDao, QiyehuifuEntity> implements QiyehuifuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiyehuifuEntity> page = this.selectPage(
                new Query<QiyehuifuEntity>(params).getPage(),
                new EntityWrapper<QiyehuifuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiyehuifuEntity> wrapper) {
		  Page<QiyehuifuView> page =new Query<QiyehuifuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiyehuifuVO> selectListVO(Wrapper<QiyehuifuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiyehuifuVO selectVO(Wrapper<QiyehuifuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiyehuifuView> selectListView(Wrapper<QiyehuifuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiyehuifuView selectView(Wrapper<QiyehuifuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
