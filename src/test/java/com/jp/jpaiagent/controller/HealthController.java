package
        com.jp.jpaiagent.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 蒋鹏
 * @version V1.0
 * @Title: HealthController
 * @Package com.jp.jpaiagent.controller
 * @Description:
 * @Copyright: Copyright (c) 2021
 * @Company:四川志诚元创信息科技有限公司
 * @date 2025/5/27 15:24
 * @description:
 */
@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping
    public String healthCheck() {
        return "ok";
    }
}
