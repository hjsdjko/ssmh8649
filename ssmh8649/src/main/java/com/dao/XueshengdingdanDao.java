package com.dao;

import com.entity.XueshengdingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengdingdanVO;
import com.entity.view.XueshengdingdanView;


/**
 * 学生订单
 * 
 * @author 
 * @email 
 * @date 2021-02-02 11:13:26
 */
public interface XueshengdingdanDao extends BaseMapper<XueshengdingdanEntity> {
	
	List<XueshengdingdanVO> selectListVO(@Param("ew") Wrapper<XueshengdingdanEntity> wrapper);
	
	XueshengdingdanVO selectVO(@Param("ew") Wrapper<XueshengdingdanEntity> wrapper);
	
	List<XueshengdingdanView> selectListView(@Param("ew") Wrapper<XueshengdingdanEntity> wrapper);

	List<XueshengdingdanView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengdingdanEntity> wrapper);
	
	XueshengdingdanView selectView(@Param("ew") Wrapper<XueshengdingdanEntity> wrapper);
	
}
