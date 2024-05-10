package com.entity.view;

import com.entity.ZhuangtaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 状态
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-02 11:13:25
 */
@TableName("zhuangtai")
public class ZhuangtaiView  extends ZhuangtaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhuangtaiView(){
	}
 
 	public ZhuangtaiView(ZhuangtaiEntity zhuangtaiEntity){
 	try {
			BeanUtils.copyProperties(this, zhuangtaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
