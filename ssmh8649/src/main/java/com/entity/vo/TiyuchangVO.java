package com.entity.vo;

import com.entity.TiyuchangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 体育场
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-02-02 11:13:25
 */
public class TiyuchangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 场地编号
	 */
	
	private String changdibianhao;
		
	/**
	 * 场地名称
	 */
	
	private String changdimingcheng;
		
	/**
	 * 状态
	 */
	
	private String zhuangtai;
		
	/**
	 * 容纳人数
	 */
	
	private String rongnarenshu;
		
	/**
	 * 费用
	 */
	
	private Integer feiyong;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 场地介绍
	 */
	
	private String changdijieshao;
				
	
	/**
	 * 设置：场地编号
	 */
	 
	public void setChangdibianhao(String changdibianhao) {
		this.changdibianhao = changdibianhao;
	}
	
	/**
	 * 获取：场地编号
	 */
	public String getChangdibianhao() {
		return changdibianhao;
	}
				
	
	/**
	 * 设置：场地名称
	 */
	 
	public void setChangdimingcheng(String changdimingcheng) {
		this.changdimingcheng = changdimingcheng;
	}
	
	/**
	 * 获取：场地名称
	 */
	public String getChangdimingcheng() {
		return changdimingcheng;
	}
				
	
	/**
	 * 设置：状态
	 */
	 
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	
	/**
	 * 获取：状态
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}
				
	
	/**
	 * 设置：容纳人数
	 */
	 
	public void setRongnarenshu(String rongnarenshu) {
		this.rongnarenshu = rongnarenshu;
	}
	
	/**
	 * 获取：容纳人数
	 */
	public String getRongnarenshu() {
		return rongnarenshu;
	}
				
	
	/**
	 * 设置：费用
	 */
	 
	public void setFeiyong(Integer feiyong) {
		this.feiyong = feiyong;
	}
	
	/**
	 * 获取：费用
	 */
	public Integer getFeiyong() {
		return feiyong;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：场地介绍
	 */
	 
	public void setChangdijieshao(String changdijieshao) {
		this.changdijieshao = changdijieshao;
	}
	
	/**
	 * 获取：场地介绍
	 */
	public String getChangdijieshao() {
		return changdijieshao;
	}
			
}
