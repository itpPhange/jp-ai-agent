package
        com.jp.jpaiagent.task;

import jakarta.annotation.Resource;
import org.springframework.ai.chat.messages.AssistantMessage;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author 蒋鹏
 * @version V1.0
 * @Title: SpringAiAiInvoke
 * @Package com.jp.jpaiagent.task
 * @Description:
 * @Copyright: Copyright (c) 2021
 * @Company:四川志诚元创信息科技有限公司
 * @date 2025/5/27 15:34
 * @description:
 */
// 取消注释即可在 SpringBoot 项目启动时执行
//@Component
public class SpringAiAiInvoke implements CommandLineRunner {

    @Resource
    private ChatModel dashscopeChatModel;

    @Override
    public void run(String... args) throws Exception {
        AssistantMessage output = dashscopeChatModel.call(new Prompt("你好，我是鱼皮"))
                .getResult()
                .getOutput();
        System.out.println(output.getText());
    }
}
