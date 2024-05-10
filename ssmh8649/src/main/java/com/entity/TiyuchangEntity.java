package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 体育场
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-02-02 11:13:25
 */
@TableName("tiyuchang")
public class TiyuchangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TiyuchangEntity() {
		
	}
	
	public TiyuchangEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 面积
	 */
					
	private String mianji;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：面积
	 */
	public void setMianji(String mianji) {
		this.mianji = mianji;
	}
	/**
	 * 获取：面积
	 */
	public String getMianji() {
		return mianji;
	}
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
