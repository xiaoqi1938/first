package cn.e3mall.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3mall.manager.service.TBItemService;
import cn.e3mall.pojo.TbItem;

@Controller
public class TBItemController {

	@Autowired
	private TBItemService tBItemService;
	
	@RequestMapping("/item/findItem/{itemId}")
	@ResponseBody
	public TbItem findItemById(@PathVariable Long itemId) throws Exception{
		return tBItemService.findItemById(itemId);
	}
}
