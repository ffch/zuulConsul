package cn.pomit.springbootwork.consulzuul.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.pomit.springbootwork.consulzuul.model.ResultModel;

@RestController
@RequestMapping("/consulZuul")
public class ConsulZuulRest {
	
	@RequestMapping(value = "/test", method = { RequestMethod.GET })
	public ResultModel ip() {
		return ResultModel.ok("test");
	}
}
