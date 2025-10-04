package com.AI.Jarvis.Controller;

import com.AI.Jarvis.service.AiService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Data
@RestController
@RequestMapping("api/ai")
public class AIController {


    @Autowired
    private final AiService aiService;



  @PostMapping("/query")
    public  ResponseEntity <Map<String,String>>queryAI(@RequestBody Map<String, String> request ){
      String prompt = request.get("prompt");
     String res = aiService.getAIResponse(prompt);
     return ResponseEntity.ok(Map.of("res", res));
  }
}
