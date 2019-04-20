package com.tms.platform.common.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {

  private String login;
  private String password;

  @Override
  public String toString() {
    return "UserDto{"
        + "login='" + login + '\''
        + '}';
  }
}
