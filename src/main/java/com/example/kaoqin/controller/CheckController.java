package com.example.kaoqin.controller;

import com.example.kaoqin.entity.Check;
import com.example.kaoqin.service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author example
 * @date 2020/2/23 9:50 上午
 */
@Controller
public class CheckController {

    @Autowired
    private CheckService checkService;

    /**
     * 一小时的毫秒数
     */
    public static final int HOUR = 1000 * 3600;

    /**
     * 列表页面
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/check", method = RequestMethod.GET)
    public String findAll(@RequestParam(value = "query", required = false) String query, Model model) {

        List<Check> checkList;
        if (query != null && !"".equals(query)) {
            checkList = checkService.findByName(query);
        } else {
            checkList = checkService.findAll();
        }
        model.addAttribute("checkList", checkList);
        return "check/list";
    }

    /**
     * 添加页面
     *
     * @return
     */
    @RequestMapping(value = "/check/add", method = RequestMethod.GET)
    public String add() {
        return "check/add";
    }

    /**
     * 编辑页面
     *
     * @return
     */
    @RequestMapping(value = "/check/edit/{id}", method = RequestMethod.GET)
    public String add(@PathVariable("id") Long id, Model model) {
        Check check = checkService.findById(id);
        // 如果不存在，则跳到添加页面
        if (check == null) {
            return "redirect:/check/add";
        }
        model.addAttribute("check", check);
        return "check/edit";
    }

    /**
     * 保存提交（更新提交或新建提交）
     *
     * @return
     */
    @RequestMapping(value = "/check/save", method = RequestMethod.POST)
    public String save(@RequestParam(value = "id", required = false) Long id,
                       @RequestParam(value = "name") String name,
                       @RequestParam(value = "age") Integer age,
                       @RequestParam(value = "number") String number,
                       @RequestParam(value = "checkInTime") String checkInTime,
                       @RequestParam(value = "checkOutTime") String checkOutTime) throws ParseException {
        Check check = new Check();
        check.setAge(age);
        check.setName(name);
        check.setNumber(number);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd'T'HH:mm");
        Date checkInDate = simpleDateFormat.parse(checkInTime);
        Date checkOutDate = simpleDateFormat.parse(checkOutTime);
        check.setCheckInTime(checkInDate);
        check.setCheckOutTime(checkOutDate);
        double duration = (checkOutDate.getTime() - checkInDate.getTime()) * 1.0 / HOUR;
        check.setDuration(duration);
        if (id != null) {
            check.setId(id);
            checkService.update(check);
        } else {
            checkService.insert(check);
        }
        return "redirect:/check";
    }

    /**
     * 删除提交
     *
     * @return
     */
    @RequestMapping(value = "/check/delete/{id}", method = RequestMethod.GET)
    public String add(@PathVariable("id") Long id) {
        checkService.deleteById(id);
        return "redirect:/check";
    }
}
