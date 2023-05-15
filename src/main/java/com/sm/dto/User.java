package com.sm.dto;

import com.sm.serializer.MaskValue;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    private Long id;
    private String userName;
    @MaskValue
    private Long phoneNumber;
    private int age;
    private String username;
    @MaskValue
    private String password;
}
