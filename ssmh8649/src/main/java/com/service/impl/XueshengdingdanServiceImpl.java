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


import com.dao.XueshengdingdanDao;
import com.entity.XueshengdingdanEntity;
import com.service.XueshengdingdanService;
import com.entity.vo.XueshengdingdanVO;
import com.entity.view.XueshengdingdanView;

@Service("xueshengdingdanService")
public class XueshengdingdanServiceImpl extends ServiceImpl<XueshengdingdanDao, XueshengdingdanEntity> implements XueshengdingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengdingdanEntity> page = this.selectPage(
                new Query<XueshengdingdanEntity>(params).getPage(),
                new EntityWrapper<XueshengdingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengdingdanEntity> wrapper) {
		  Page<XueshengdingdanView> page =new Query<XueshengdingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengdingdanVO> selectListVO(Wrapper<XueshengdingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengdingdanVO selectVO(Wrapper<XueshengdingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengdingdanView> selectListView(Wrapper<XueshengdingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengdingdanView selectView(Wrapper<XueshengdingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
