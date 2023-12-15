package com.dao;

import com.entity.DiscussyaopinxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyaopinxinxiVO;
import com.entity.view.DiscussyaopinxinxiView;


/**
 * 药品信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-23 08:51:28
 */
public interface DiscussyaopinxinxiDao extends BaseMapper<DiscussyaopinxinxiEntity> {
	
	List<DiscussyaopinxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussyaopinxinxiEntity> wrapper);
	
	DiscussyaopinxinxiVO selectVO(@Param("ew") Wrapper<DiscussyaopinxinxiEntity> wrapper);
	
	List<DiscussyaopinxinxiView> selectListView(@Param("ew") Wrapper<DiscussyaopinxinxiEntity> wrapper);

	List<DiscussyaopinxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyaopinxinxiEntity> wrapper);
	
	DiscussyaopinxinxiView selectView(@Param("ew") Wrapper<DiscussyaopinxinxiEntity> wrapper);
	
}
