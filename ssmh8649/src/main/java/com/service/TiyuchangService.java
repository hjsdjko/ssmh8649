package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TiyuchangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TiyuchangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TiyuchangView;


/**
 * 体育场
 *
 * @author 
 * @email 
 * @date 2021-02-02 11:13:25
 */
public interface TiyuchangService extends IService<TiyuchangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TiyuchangVO> selectListVO(Wrapper<TiyuchangEntity> wrapper);
   	
   	TiyuchangVO selectVO(@Param("ew") Wrapper<TiyuchangEntity> wrapper);
   	
   	List<TiyuchangView> selectListView(Wrapper<TiyuchangEntity> wrapper);
   	
   	TiyuchangView selectView(@Param("ew") Wrapper<TiyuchangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TiyuchangEntity> wrapper);
   	
}

