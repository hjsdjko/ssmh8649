package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengdingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengdingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengdingdanView;


/**
 * 学生订单
 *
 * @author 
 * @email 
 * @date 2021-02-02 11:13:26
 */
public interface XueshengdingdanService extends IService<XueshengdingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengdingdanVO> selectListVO(Wrapper<XueshengdingdanEntity> wrapper);
   	
   	XueshengdingdanVO selectVO(@Param("ew") Wrapper<XueshengdingdanEntity> wrapper);
   	
   	List<XueshengdingdanView> selectListView(Wrapper<XueshengdingdanEntity> wrapper);
   	
   	XueshengdingdanView selectView(@Param("ew") Wrapper<XueshengdingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengdingdanEntity> wrapper);
   	
}

