package com.bin.control;

import com.bin.entity.Story;
import com.bin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.logging.Logger;

/**
 * Created by richard02.zhang on 2016/8/12.
 */

@Controller
@RequestMapping("/user")
public class UserCtrl {

	private static Logger logger = Logger.getLogger(UserCtrl.class.getName());

	@Autowired
	UserService userService;

	@RequestMapping("/index")
	public ModelAndView index(){
		ModelAndView mav = new ModelAndView("/story/index");
		return mav;
	}

	@RequestMapping("/save")
	public ModelAndView saveUser(Story story){

		ModelAndView mav = new ModelAndView("/story/index");

		logger.info("save:"+ story);

		userService.saveUser(story);

		return mav;
	}

	@RequestMapping("/find")
	public ModelAndView findUser(Story story){

		ModelAndView mav = new ModelAndView("/story/index");

		story = userService.findUserByName(story.getName());

		logger.info("find:"+ story);

		return mav;
	}
}
