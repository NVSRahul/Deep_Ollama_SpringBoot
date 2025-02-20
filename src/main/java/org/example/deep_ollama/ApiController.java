package org.example.deep_ollama;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/chat")
@CrossOrigin(origins = "*")
public class ApiController {

    private final ChatClient chatClient;

    public ApiController(ChatClient.Builder chatClient) {
        this.chatClient = chatClient.build();
    }

    @PostMapping
    public ResponseEntity<String> chatWithAI(@RequestBody Map<String, String> request) {
        try {
            String chat = request.get("message");  // Extract "message" from JSON
            if (chat == null || chat.isEmpty()) {
                return ResponseEntity.badRequest().body("Error: Message cannot be empty");
            }

            String response = chatClient
                    .prompt(chat)
                    .call()
                    .content();

            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error: " + e.getMessage());
        }
    }
}
