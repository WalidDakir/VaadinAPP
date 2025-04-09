package ma.enset.vaadinapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ma.enset.vaadinapp.service.ChatService;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    @Autowired
    private ChatService chatService;

    @PostMapping("/message")
    public ResponseEntity<String> getResponse(@RequestBody String message) {
        String response = chatService.getChatbotResponse(message);
        return ResponseEntity.ok(response);
    }
}
