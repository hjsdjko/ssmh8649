package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuangtaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuangtaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuangtaiView;


/**
 * 状态
 *
 * @author 
 * @email 
 * @date 2021-02-02 11:13:25
 */
public interface ZhuangtaiService extends IService<ZhuangtaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuangtaiVO> selectListVO(Wrapper<ZhuangtaiEntity> wrapper);
   	
   	ZhuangtaiVO selectVO(@Param("ew") Wrapper<ZhuangtaiEntity> wrapper);
   	
   	List<ZhuangtaiView> selectListView(Wrapper<ZhuangtaiEntity> wrapper);
   	
   	ZhuangtaiView selectView(@Param("ew") Wrapper<ZhuangtaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuangtaiEntity> wrapper);
   	
}

