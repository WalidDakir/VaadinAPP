package ma.enset.vaadinapp.service;

import org.springframework.stereotype.Service;

@Service
public class ChatService {

    public String getChatbotResponse(String message) {

        return "Réponse générée par le modèle RAG";
    }
}
