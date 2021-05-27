package com.project.entertainment_spring_boot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlaylistDto {
    private Long id;

    private String name;
    private String musicType;
    private String description;
    private List<SongDto> songQuantity = new ArrayList<>();
    private String dateCreated;
    private AppUserDto creator;

    private Timestamp dateUpdated;

    private Long view;
}
