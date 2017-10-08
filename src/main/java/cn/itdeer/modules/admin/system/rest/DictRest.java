package cn.itdeer.modules.admin.system.rest;

import cn.itdeer.common.api.ApiResult;
import cn.itdeer.common.api.ApiResultStatus;
import cn.itdeer.common.base.BaseMessage;
import cn.itdeer.common.exception.ValidateException;
import cn.itdeer.modules.admin.system.entity.Dict;
import cn.itdeer.modules.admin.system.service.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * 描述：系统字典-接口
 * 创建人：Itdeer
 * 创建时间：2017/9/19 0:28
 */
@RestController
@RequestMapping(value="/api/system/dict")
public class DictRest {

    @Autowired
    private DictService dictService;


    @PostMapping(value = "/save2")
    public ApiResult<Dict> save2(@Valid Dict dict, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return ApiResultStatus.error(1,bindingResult.getFieldError().getDefaultMessage());
        }
        return ApiResultStatus.success(dictService.save2(dict));
    }

    @GetMapping(value = "/getDict/value/{id}")
    public void  getValue(@PathVariable("id") String id) throws Exception{
        dictService.findById2(id);
    }

    @GetMapping(value = "/list")
    public void  list(){
        dictService.list();
    }


    @GetMapping(value = "/findAll")
    public String findAll(){
        Map map = new HashMap();
        map.put("1","ggggg");
        map.put("2","fffff");
        map.put("3","ttttt");

        return map.toString();
    }

}
