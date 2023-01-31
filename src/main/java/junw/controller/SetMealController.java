package junw.controller;

import junw.service.SetMealService;
import junw.service.SetmealDishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Intellij IDEA.
 * Project:reggie_takeaway
 * Package:junw.controller
 *
 * @author liujiajun_junw
 * @Date 2023-01-19-03  星期五
 * @description
 */
@RestController
@Slf4j
@RequestMapping("/setmeal")
public class SetMealController {
	@Autowired
	private SetMealService setMealService;

	@Autowired
	private SetmealDishService setmealDishService;


}
