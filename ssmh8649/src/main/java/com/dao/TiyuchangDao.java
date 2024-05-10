package com.dao;

import com.entity.TiyuchangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TiyuchangVO;
import com.entity.view.TiyuchangView;


/**
 * 体育场
 * 
 * @author 
 * @email 
 * @date 2021-02-02 11:13:25
 */
public interface TiyuchangDao extends BaseMapper<TiyuchangEntity> {
	
	List<TiyuchangVO> selectListVO(@Param("ew") Wrapper<TiyuchangEntity> wrapper);
	
	TiyuchangVO selectVO(@Param("ew") Wrapper<TiyuchangEntity> wrapper);
	
	List<TiyuchangView> selectListView(@Param("ew") Wrapper<TiyuchangEntity> wrapper);

	List<TiyuchangView> selectListView(Pagination page,@Param("ew") Wrapper<TiyuchangEntity> wrapper);
	
	TiyuchangView selectView(@Param("ew") Wrapper<TiyuchangEntity> wrapper);
	
}
