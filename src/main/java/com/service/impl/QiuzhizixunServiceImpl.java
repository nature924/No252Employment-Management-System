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


import com.dao.QiuzhizixunDao;
import com.entity.QiuzhizixunEntity;
import com.service.QiuzhizixunService;
import com.entity.vo.QiuzhizixunVO;
import com.entity.view.QiuzhizixunView;

@Service("qiuzhizixunService")
public class QiuzhizixunServiceImpl extends ServiceImpl<QiuzhizixunDao, QiuzhizixunEntity> implements QiuzhizixunService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiuzhizixunEntity> page = this.selectPage(
                new Query<QiuzhizixunEntity>(params).getPage(),
                new EntityWrapper<QiuzhizixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiuzhizixunEntity> wrapper) {
		  Page<QiuzhizixunView> page =new Query<QiuzhizixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiuzhizixunVO> selectListVO(Wrapper<QiuzhizixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiuzhizixunVO selectVO(Wrapper<QiuzhizixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiuzhizixunView> selectListView(Wrapper<QiuzhizixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiuzhizixunView selectView(Wrapper<QiuzhizixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
