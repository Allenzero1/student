package com.qf.controller;

import com.qf.entity.Student;
import com.qf.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

/**
 * @author zqq
 * @version 1.0
 * @Date 2019/11/27
 */

@Controller
@RequestMapping("/stu")
public class StuController {

    @Autowired
    private IStuService stuService;

    @RequestMapping("/list")
    public String   getByList(ModelMap map){
        System.out.println("启动成功!");
        List<Student> stulist= stuService.list();
        map.put("stulist",stulist);
        return "student";
    }
    @RequestMapping("/del")
    public  String delById(int id ){
        stuService.removeById(id);
        return "redirect:/stu/list";
    }

    @RequestMapping("toadd")
    public String toAdd(){

        return "add";
    }

    @RequestMapping("/add")
    public String addStu(Student student){
        stuService.save(student);
        return "redirect:/stu/list";
    }

    @RequestMapping("/back")
    public String backToIndex(){
        return  "index";
    }

}
