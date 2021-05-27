package com.project.entertainment_spring_boot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;
import javax.persistence.*;
import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SongDto {
    private Long id;
    private String name;
    private String description;
    @Transient
    private MultipartFile fileMp3;
    private String linkMp3;
    @Transient
    private MultipartFile fileAvatar;
    private String linkImg;

    private String author;
    private AppUserDto creator;
    private String musicType;
    private String album;
    public List<SingerDto> singerList;

    private List<Long> singerValues = new ArrayList<>();
    private Long view;
    private List<PlaylistDto> playlists;
}
