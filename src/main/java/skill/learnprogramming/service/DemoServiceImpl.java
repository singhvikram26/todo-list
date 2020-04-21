package skill.learnprogramming.service;

import org.springframework.stereotype.Service;
import skill.learnprogramming.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String getHelloMessage(String user) {
        return "Hello "+user;
    }

    @Override
    public String getWelcomeMessage() {
        return "Welcome to this Demo Application.";
    }
}
