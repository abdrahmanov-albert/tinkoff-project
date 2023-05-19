package ru.tinkoff.edu.java.bot.service;

import org.springframework.stereotype.Component;
import org.telegram.abilitybots.api.objects.MessageContext;
import ru.tinkoff.edu.java.bot.dto.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class ResponseService {

    public String startResponse(User user, Long ctx){

        return "Старт";
    }

    public String trackResponse(User user, String secondArg){
        if(user!=null)
            if (user.links!=null) {
                user.links.add(secondArg);
                return "Добавлено";
        }
        return "Нажми /start";

    }

    public String untrackResponse(User user, Long ctx){
        if(user!=null&&user.links!=null)
            return "Удалено";
        return "Добавлено";
    }

    public String listResponse(User user, Long ctx){
        if(user!=null)
            return "Ссылки: " + user.links.toString();
        return "Нет ссылок";
    }
}
