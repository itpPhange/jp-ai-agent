package
        com.jp.jpaiagent.service;

import jakarta.annotation.Resource;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.MessageChatMemoryAdvisor;
import org.springframework.ai.chat.client.advisor.QuestionAnswerAdvisor;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.stereotype.Service; /**
 * @author 蒋鹏
 * @version V1.0
 * @Title: ChatService
 * @Package com.jp.jpaiagent.service
 * @Description:
 * @Copyright: Copyright (c) 2021
 * @Company:四川志诚元创信息科技有限公司
 * @date 2025/5/27 16:16
 * @description:
 */
// 方式1：使用构造器注入
@Service
public class ChatService {
    private final ChatClient chatClient;

    public ChatService(ChatClient.Builder builder) {
        this.chatClient = builder
                .defaultSystem("你是恋爱顾问")
                .build();
    }






}


