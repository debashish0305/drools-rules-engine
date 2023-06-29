package com.db.drools.rules.engine.rest;

import com.db.drools.rules.engine.model.Data;
import lombok.RequiredArgsConstructor;
import org.kie.api.runtime.KieSession;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/rules")
public class RuleController {


    private final KieSession kieSession;

    @PostMapping
    public Mono<String> processRule(@RequestBody Data data) {
        kieSession.insert(data);
        kieSession.fireAllRules();
        return Mono.just(data.getMessage());
    }

    @GetMapping("/fetch")
    public Mono<String> getRule() {
        return Mono.just("Rules Engine Running..");

    }
}
