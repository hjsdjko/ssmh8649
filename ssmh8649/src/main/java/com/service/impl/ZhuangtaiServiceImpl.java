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


import com.dao.ZhuangtaiDao;
import com.entity.ZhuangtaiEntity;
import com.service.ZhuangtaiService;
import com.entity.vo.ZhuangtaiVO;
import com.entity.view.ZhuangtaiView;

@Service("zhuangtaiService")
public class ZhuangtaiServiceImpl extends ServiceImpl<ZhuangtaiDao, ZhuangtaiEntity> implements ZhuangtaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuangtaiEntity> page = this.selectPage(
                new Query<ZhuangtaiEntity>(params).getPage(),
                new EntityWrapper<ZhuangtaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuangtaiEntity> wrapper) {
		  Page<ZhuangtaiView> page =new Query<ZhuangtaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhuangtaiVO> selectListVO(Wrapper<ZhuangtaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuangtaiVO selectVO(Wrapper<ZhuangtaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuangtaiView> selectListView(Wrapper<ZhuangtaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuangtaiView selectView(Wrapper<ZhuangtaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
