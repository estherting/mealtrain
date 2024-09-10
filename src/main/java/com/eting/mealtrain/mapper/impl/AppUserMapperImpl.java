package com.eting.mealtrain.mapper.impl;

import com.eting.mealtrain.dto.AppUserDto;
import com.eting.mealtrain.entity.AppUser;
import com.eting.mealtrain.mapper.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class AppUserMapperImpl implements Mapper<AppUser, AppUserDto> {

    private ModelMapper modelMapper;

    public AppUserMapperImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public AppUserDto mapTo(AppUser inAppUser) {
        return modelMapper.map(inAppUser, AppUserDto.class);
    }

    @Override
    public AppUser mapFrom(AppUserDto inDto) {
        return modelMapper.map(inDto, AppUser.class);
    }
}
