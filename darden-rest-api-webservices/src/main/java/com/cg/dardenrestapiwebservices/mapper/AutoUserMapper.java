package com.cg.dardenrestapiwebservices.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.cg.dardenrestapiwebservices.dto.UserDto;
import com.cg.dardenrestapiwebservices.entity.User;

@Mapper
public interface AutoUserMapper {

    AutoUserMapper MAPPER = Mappers.getMapper(AutoUserMapper.class);

    UserDto mapToUserDto(User user);

    User mapToUser(UserDto userDto);
}

