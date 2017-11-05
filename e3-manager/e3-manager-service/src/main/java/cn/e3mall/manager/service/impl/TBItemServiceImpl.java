package cn.e3mall.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3mall.manager.service.TBItemService;
import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;

@Service
public class TBItemServiceImpl implements TBItemService {
	
	@Autowired
	private TbItemMapper tbItemMapper;
	
	@Override
	public TbItem findItemById(Long itemId) {
		return tbItemMapper.selectByPrimaryKey(itemId);
	}

}
