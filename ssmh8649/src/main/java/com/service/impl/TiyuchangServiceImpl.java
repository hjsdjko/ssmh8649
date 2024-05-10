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


import com.dao.TiyuchangDao;
import com.entity.TiyuchangEntity;
import com.service.TiyuchangService;
import com.entity.vo.TiyuchangVO;
import com.entity.view.TiyuchangView;

@Service("tiyuchangService")
public class TiyuchangServiceImpl extends ServiceImpl<TiyuchangDao, TiyuchangEntity> implements TiyuchangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TiyuchangEntity> page = this.selectPage(
                new Query<TiyuchangEntity>(params).getPage(),
                new EntityWrapper<TiyuchangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TiyuchangEntity> wrapper) {
		  Page<TiyuchangView> page =new Query<TiyuchangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TiyuchangVO> selectListVO(Wrapper<TiyuchangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TiyuchangVO selectVO(Wrapper<TiyuchangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TiyuchangView> selectListView(Wrapper<TiyuchangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TiyuchangView selectView(Wrapper<TiyuchangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
