package com.db.drools.rules.engine.model;

import com.db.drools.rules.engine.utils.EGender;
import com.db.drools.rules.engine.utils.EState;
import com.db.drools.rules.engine.utils.EVehicle;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@lombok.Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Data {
    String city;
    EVehicle evehicle;
    double amount;
    EGender gender;
    // @JsonIgnore
    double discountAmount;
    String discountRate;
    EState state;
    String message;
}
