package com.tms.platform.common.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserDtoTest {

  @Test
  void toStringTest() {
    final UserDto userDto = new UserDto();
    userDto.setLogin("user");
    userDto.setPassword("password");
    Assertions.assertEquals("UserDto{login=\'user\'}", userDto.toString());
  }
}