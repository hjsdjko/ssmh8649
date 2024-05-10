package com.dao;

import com.entity.ZhuangtaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuangtaiVO;
import com.entity.view.ZhuangtaiView;


/**
 * 状态
 * 
 * @author 
 * @email 
 * @date 2021-02-02 11:13:25
 */
public interface ZhuangtaiDao extends BaseMapper<ZhuangtaiEntity> {
	
	List<ZhuangtaiVO> selectListVO(@Param("ew") Wrapper<ZhuangtaiEntity> wrapper);
	
	ZhuangtaiVO selectVO(@Param("ew") Wrapper<ZhuangtaiEntity> wrapper);
	
	List<ZhuangtaiView> selectListView(@Param("ew") Wrapper<ZhuangtaiEntity> wrapper);

	List<ZhuangtaiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuangtaiEntity> wrapper);
	
	ZhuangtaiView selectView(@Param("ew") Wrapper<ZhuangtaiEntity> wrapper);
	
}
