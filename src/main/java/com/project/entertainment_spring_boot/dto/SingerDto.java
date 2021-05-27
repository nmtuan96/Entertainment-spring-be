package com.project.entertainment_spring_boot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SingerDto {
    private Long id;
    private String name;
    private String gender;
    private Date birthday;
    private String musicType;
    private String story;
    private String band;
    public List<SongDto> songList;
    private Long view;
    @Transient
    @ElementCollection
    private List<Long> tuan;

    private String valuesSong;

    @Transient
    private MultipartFile fileAvatar;
    private String linkImg;
}
